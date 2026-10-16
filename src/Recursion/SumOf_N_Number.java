package Recursion;

import java.util.*;
public class SumOf_N_Number {
    public static int sumOfNo(int n){
        if(n<1) return 0;
        return n + sumOfNo(n-1);
    }
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(sumOfNo(n));
    }
}
