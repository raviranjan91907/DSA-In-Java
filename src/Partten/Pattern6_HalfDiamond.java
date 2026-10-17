package Partten;

import java.util.*;
public class Pattern6_HalfDiamond {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();

        for(int i=0;i<2*n-1;i++){
            if(i<=((2*n-1)/2)){
                for(int j=0;j<i+1;j++){
                    System.out.print("*");
                }
            }
            else{
                for(int j=0;j<2*n-i-1;j++){
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
