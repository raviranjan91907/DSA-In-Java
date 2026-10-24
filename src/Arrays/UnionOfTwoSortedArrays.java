package Arrays;

import java.util.*;
public class UnionOfTwoSortedArrays {
    public static List<Integer> unionArray(List<Integer> arr1,List<Integer> arr2){
        int i=0;
        int j=0;
        List<Integer> ans=new ArrayList<>();

        while(i<arr1.size() && j<arr2.size()){
            if(arr1.get(i)<arr2.get(j)){
                if(ans.size()<=0){
                    ans.add(arr1.get(i));
                }
                else{
                    if(ans.get(ans.size()-1)!=arr1.get(i)){
                        ans.add(arr1.get(i));
                    }
                }
                i++;
            }
            else{
                if(ans.size()<=0){
                    ans.add(arr2.get(j));
                }
                else{
                    if(ans.get(ans.size()-1)!=arr2.get(j)){
                        ans.add(arr2.get(j));
                    }
                }
                j++;
            }
        }

        while(i<arr1.size()){
            if(ans.size()<=0){
                ans.add(arr1.get(i));
            }
            else{
                if(ans.get(ans.size()-1)!=arr1.get(i)){
                    ans.add(arr1.get(i));
                }
            }
            i++;
        }

        while(j<arr2.size()){
            if(ans.size()<=0){
                ans.add(arr2.get(j));
            }
            else{
                if(ans.get(ans.size()-1)!=arr2.get(j)){
                    ans.add(arr2.get(j));
                }
            }
            j++;
        }

        return ans;

    }

    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
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

        System.out.println(unionArray(arr1,arr2));
    }

}
