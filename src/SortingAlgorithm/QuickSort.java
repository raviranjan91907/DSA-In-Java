package SortingAlgorithm;

import java.util.*;
public class QuickSort {
    public static void swap(List<Integer> arr,int i,int j){
        int temp=arr.get(i);
        arr.set(i,arr.get(j));
        arr.set(j,temp);
        return ;
    }

    public static int findPivot(List<Integer> arr,int i,int j,int pivotElement){

        int low=i;
        int high=j;
        while(low<=high){
            while(low<=high && arr.get(low)<=pivotElement) {
                low++;
            }
            while(low<=high && arr.get(high)>pivotElement) {
                high--;
            }
            if (low <= high) {
                swap(arr, low, high);
                low++;
                high--;
            }
        }
        swap(arr,i,high);
        return high;
    }

    public static void quickSort(List<Integer> arr,int i,int j){
            if(i>=j){
                return;
            }

            int pivot=findPivot(arr,i,j,arr.get(i));
            quickSort(arr,i,pivot-1);
            quickSort(arr,pivot+1,j);

            return;
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        List<Integer> arr=new ArrayList<>();
        for(int i=0;i<n;i++){
            arr.add(sc.nextInt());
        }

        quickSort(arr,0,n-1);
        System.out.println(arr);
    }
}
