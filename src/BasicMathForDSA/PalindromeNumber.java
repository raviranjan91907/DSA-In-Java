package BasicMathForDSA;

public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        int dup=x;
        int reverseNo=0;
        while(x>0){
            int remainder=x%10;
            x/=10;

            reverseNo=reverseNo*10 + remainder;
        }
        return reverseNo==dup ? true:false;
    }
}
