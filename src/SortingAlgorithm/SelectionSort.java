package SortingAlgorithm;

import java.util.*;
public class SelectionSort {
    public static List<Integer> selectionSort(List<Integer> arr){
        int n=arr.size();
        for(int i=0;i<n-1;i++){
            int min=i;
            for(int j=i+1;j<n;j++){
                if(arr.get(j)<arr.get(min)) min=j;
            }

            int temp=arr.get(i);
            arr.set(i,arr.get(min));
            arr.set(min,temp);
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

        System.out.println(selectionSort(arr));
    }
}
