package SortingAlgorithm;

import java.util.*;
public class InsertionSort {
    public static List<Integer> insertionSort(List<Integer> arr){
        int n=arr.size();

        for(int i=1;i<n;i++){
            int j=i;
            while(j>0 && arr.get(j-1)>arr.get(j)){
                Collections.swap(arr,j-1,j);
                j--;
            }
        }
        return arr;
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        List<Integer> arr=new ArrayList<>();

        for(int i=0;i<n;i++){
            arr.add(sc.nextInt());
        }

        System.out.println(insertionSort(arr));
    }
}
