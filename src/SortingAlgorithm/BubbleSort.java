package SortingAlgorithm;
/*
Bubble Sort is a sorting algorithm that repeatedly compares two adjacent elements and swaps them if they are in the wrong order.

It is called Bubble Sort because, during each pass, the largest unsorted element moves toward the end of the array, just like a bubble rising to the surface.

Time and space complexity
Case	        Time complexity
Best case	    O(n^2) for the basic code above
Average case    O(n^2)
Worst case	    O(n^2)

- Space complexity: \(O(1)\), because sorting happens in the original array.
- Stable: Yes, because equal elements are not swapped.
- In-place: Yes.
The best-case complexity can be improved to O(n) by adding a swapped flag that stops the algorithm when a complete pass makes no swaps.
 */
import java.util.*;
public class BubbleSort {
    public static List<Integer> bubbleSort(List<Integer> arr){
        int n=arr.size();
        for(int i=0;i<n-1;i++){
            int didSwap=0;
            for(int j=0;j<n-i-1;j++){
                if(arr.get(j)>arr.get(j+1)) {
                    Collections.swap(arr, j, j+1);
                    didSwap=1;
                }
            }

            if(didSwap==0) break;

        }
        return arr;
    }

    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();

        List<Integer> arr=new ArrayList<>();
        for(int i=0;i<n;i++){
            arr.add(sc.nextInt());
        }

        System.out.println(bubbleSort(arr));
    }

}
