package Recursion;

import java.util.*;
public class FibonacciNumber {
    public static int nthFibonacciNumber(int n){
        if(n<=1) return n;
        return nthFibonacciNumber(n-1)+nthFibonacciNumber(n-2);
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        System.out.println(nthFibonacciNumber(n));
    }
}
