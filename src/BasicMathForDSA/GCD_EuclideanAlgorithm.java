package BasicMathForDSA;


import java.util.*;
/*
  ->The Euclidean Algorithm is an algorithm used to find the GCD (Greatest Common Divisor) of two integers.
  ->The GCD is the largest positive number that divides two numbers exactly, without leaving a remainder.

    For example, the GCD of 12 and 18 is 6 because:
    - Factors of 12: 1, 2, 3, 4, 6, 12
    - Factors of 18: 1, 2, 3, 6, 9, 18
    The largest common factor is 6.
    1. How does the Euclidean Algorithm work?
    The main idea is:
    GCD(a, b) = GCD(b, a % b) where a>b

    The time complexity of the Euclidean Algorithm is \(O(\log(\min(a,b)))\),
 */

public class GCD_EuclideanAlgorithm {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int a=sc.nextInt();
        int b=sc.nextInt();

        while(a>0 && b>0){
            if(b<a) a=a%b;
            else b=b%a;
        }
        System.out.println(a==0 ? b:a);
    }
}
