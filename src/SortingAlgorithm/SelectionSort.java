package SortingAlgorithm;


/*

Selection Sort in Java
Selection Sort is a sorting algorithm that repeatedly finds the smallest element from the unsorted part of an array and places it at the beginning of that unsorted part.

Think of it this way: find the smallest number, put it first, then find the next smallest number and put it second. Repeat until the array is sorted.

Time and space complexity
Case	        Time complexity
Best case	    O(n^2)
Average case	O(n^2)
Worst case	    O(n^2)

- Space complexity: O(1), because it sorts the original array.
- In-place: Yes.
- Stable: No, not in its standard implementation.
Even if the array is already sorted, Selection Sort still scans the unsorted portion to find the minimum.
 */
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
