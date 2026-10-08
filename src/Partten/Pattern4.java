package Partten;

import java.util.Scanner;
/*
        *
       ***
      *****
     *******
    *********
     *******
      *****
       ***
        *
 */
public class Pattern4 {
    public static void main(String agrs[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        for(int i=0;i<2*n-1;i++){
            if(i<=(2*n-1)/2){
                for(int j=0;j<n-i-1;j++){
                    System.out.print(" ");
                }
                for(int q=0;q<2*i+1;q++){
                    System.out.print("*");
                }
            }
            else {
                for (int l = 0; l < i - n + 1; l++) {
                    System.out.print(" ");
                }
                for (int k = 0; k <2 * (2 * n - i - 1) - 1; k++) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
