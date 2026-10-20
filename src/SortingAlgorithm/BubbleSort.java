package SortingAlgorithm;

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
