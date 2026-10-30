package LeetCode_Question.Medium;

public class ReverseInteger {
    public int reverse(int x) {
        Boolean b=false;

        if(x<0){
            b=!b;
            x=-x;
        }

        int reverse=0;

        while(x>0){
            int remainder=x%10;
            if(reverse> Integer.MAX_VALUE/10) return 0;

            reverse=reverse*10+remainder;
            x/=10;
        }

        return  b ? -reverse : reverse;

    }
}
