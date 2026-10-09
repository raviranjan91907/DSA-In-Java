package Partten;

/*
        *
       * *
      *   *
     *     *
    *       *
     *     *
      *   *
       * *
        *
 */
import java.util.*;
public class Pattern5 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();

        for(int i=0;i<2*n-1;i++){
            if(i<=(2*n-1)/2){
                for(int j=0;j<n-i-1;j++){
                    System.out.print(" ");
                }

                System.out.print("*");

                for(int q=0;q<2*(i-1)+1;q++){
                    System.out.print(" ");
                }

                if(i!=0) System.out.print("*");
            }
            else{
                for(int j=0;j<i-n+1;j++){
                    System.out.print(" ");
                }
                System.out.print("*");

                for(int q=0;q<2*(2*n-i-2)-1;q++){
                    System.out.print(" ");
                }

                if(i!=2*n-2) System.out.print("*");

            }
            System.out.println();
        }
    }
}
