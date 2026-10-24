package Arrays;

import java.util.*;
public class IntersectionOfTwoSortedArray {
    public static List<Integer> intersectionArray(List<Integer> arr1,List<Integer> arr2){
        int i=0;
        int j=0;
        List<Integer> ans=new ArrayList<>();
        while(i<arr1.size() && j<arr2.size()){
            if(arr1.get(i)<arr2.get(j)) i++;
            else if(arr2.get(j)<arr1.get(i)) j++;
            else{
                ans.add(arr1.get(i));
                i++;
                j++;
            }
        }
        return ans;
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();

        List<Integer> arr1=new ArrayList<>();
        for(int i=0;i<n1;i++){
            arr1.add(sc.nextInt());
        }

        int n2=sc.nextInt();
        List<Integer> arr2=new ArrayList<>();
        for(int i=0;i<n2;i++){
            arr2.add(sc.nextInt());
        }

        System.out.println(intersectionArray(arr1,arr2));
    }
}
