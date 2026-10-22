package SortingAlgorithm;


/*
Insertion Sort in Java
Insertion Sort is a sorting algorithm that sorts elements by taking one element at a time and inserting it into its correct position among the elements that are already sorted.

Think about how you arrange playing cards in your hand. You pick one card at a time and place it in the correct position. Insertion Sort works in the same way.

Time and space complexity
Case	Time    complexity	When?
Best	O(n)	Array is already sorted
Average	O(n^2)	Elements are in mixed order
Worst	O(n^2)	Array is sorted in reverse order

Space complexity: \(O(1)\), because we sort the original array and use only a few extra variables.
Stable: Yes. Equal elements retain their original relative order.
In-place: Yes. No additional array is required.
 */
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
