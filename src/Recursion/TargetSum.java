package Recursion;

import java.util.*;
public class TargetSum {
    static List<List<Integer>> ans=new ArrayList<>();
    static List<Integer> temp=new ArrayList<>();
    public static List<List<Integer>> targetSum(int i,List<Integer> arr,int target,int sum){
        if(i>=arr.size()){
            if(sum==target){
                ans.add(new ArrayList<>(temp));
                return ans;
            }
            return ans;
        }

        temp.add(arr.get(i));
        ans=targetSum(i+1,arr,target,sum+arr.get(i));

        temp.remove(temp.size()-1);
        ans=targetSum(i+1,arr,target,sum);

        return ans;


    }

    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);

        int target=sc.nextInt();
        int n=sc.nextInt();

        List<Integer> arr=new ArrayList<>();
        for(int i=0;i<n;i++){
            arr.add(sc.nextInt());
        }

        System.out.println(targetSum(0,arr,target,0));
    }
}
