package LeetCode_Question.Medium;

import java.util.*;
public class RotateAnArray {
    public static void leftRotateAnArrayByOnePlace(List<Integer> arr){
        int temp=arr.get(0);
        for(int i=0;i<arr.size()-1;i++){
            arr.set(i,arr.get(i+1));
        }

        arr.set(arr.size()-1,temp);
        System.out.println(arr);
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        List<Integer> arr=new ArrayList<>();
        for(int i=0;i<n;i++){
            arr.add(sc.nextInt());
        }

        leftRotateAnArrayByOnePlace(arr);
    }
}
