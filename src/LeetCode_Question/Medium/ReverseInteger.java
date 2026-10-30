package LeetCode_Question.Medium;

public class ReverseInteger {
    public int reverse(int x) {

        long num = x;
        boolean b = false;

        if(num < 0) {
            b = true;
            num = -num;
        }

        long reverse = 0;

        while(num > 0) {
            int remainder = (int)(num % 10);

            reverse = reverse * 10 + remainder;

            if(reverse > Integer.MAX_VALUE) {
                return 0;
            }

            num /= 10;
        }

        return b ? (int)(-reverse) : (int)reverse;
    }
}
