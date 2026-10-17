package Recursion;

import java.util.*;

public class ReverseAnArray {
    public static void reverseArray(int i,int arr[],int n){
        if(i>=n/2) return ;

        int tmp=arr[i];
        arr[i]=arr[n-i-1];
        arr[n-i-1]=tmp;

        reverseArray(i+1,arr,n);
        return;
    }

    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();

        int arr[]=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        reverseArray(0,arr,n);

        printArray(arr);



    }
}
