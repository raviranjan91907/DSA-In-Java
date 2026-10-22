package SortingAlgorithm;


/*
Merge Sort in Java
Merge Sort is a popular sorting algorithm that uses the divide-and-conquer technique. It divides a list into smaller parts, sorts those parts, and then merges them back together in sorted order.

Since you've been learning Quick Sort, the main difference to remember is:
- Quick Sort: partitions elements around a pivot.
- Merge Sort: divides the list into halves, then merges the sorted halves.


Feature	Quick Sort	Merge Sort
Main operation	    Partition	    Merge
Average time	    O(n\log n)	    O(n\log n)
Worst-case time	    O(n^2)	        O(n\log n)
Extra array memory	Usually no	    Yes
Stable by default	No	            Yes, with a stable merge implementation
 */

import java.util.*;
public class MergeSort {
    public static void merge(List<Integer> arr,int low,int mid,int high){

        int left=low;
        int right=mid+1;

        List<Integer> temp=new ArrayList<>();
        while(left<=mid+1 && right<=high){
            if(arr.get(left)<arr.get(right)){
                temp.add(arr.get(left));
                left++;
            }
            /*while(left.get(i)>right.get(j))*/
            else{
                temp.add(arr.get(right));
                right++;
            }
        }

        while(left<=mid){
            temp.add(arr.get(left));
            left++;
        }

        while(right<=high){
            temp.add(arr.get(right));
            right++;
        }

        for(int i=low;i<=high;i++){
            arr.set(i,temp.get(i-low)) ;
        }

        return;
    }

    public static void mergeSort(List<Integer> arr,int low,int high){
        if(low==high){
            return;
        }

        int mid=(low+high)/2;
        mergeSort(arr,low,mid);
        mergeSort(arr,mid+1,high);

        merge(arr,low,mid,high);

        return;

    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        List<Integer> arr=new ArrayList<>();
        for(int i=0;i<n;i++){
            arr.add(sc.nextInt());
        }

        mergeSort(arr,0,n-1);

        System.out.println(arr);
    }
}
