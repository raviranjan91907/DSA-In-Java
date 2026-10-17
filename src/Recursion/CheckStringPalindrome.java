package Recursion;

import java.util.*;
public class CheckStringPalindrome {
    public static boolean palindromeCheck(int i,String str){
        if(i>=str.length()/2) return true;

        if(str.charAt(i)!=str.charAt(str.length()-i-1)) return false;
        return palindromeCheck(i+1,str);
    }

    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        String str=sc.nextLine();

        System.out.println("The given String is Palindrome"+ palindromeCheck(0,str));
    }
}
