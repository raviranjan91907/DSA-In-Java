package Partten;

//     *
//    ***
//   *****
//  *******
// *********

import java.util.*;
public class pattern3 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();

        for(int i=0;i<a;i++){
            for(int j=0;j<a-i-1;j++){
                System.out.print(" ");
            }
            for(int q=0;q<2*i+1;q++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
