package LeetCode_Question.Medium;

public class StringToIntegerAIOT {
    public int myAtoi(String s) {
        long num=0;
        int sign=1;
        s = s.trim();

        for(int i=0;i<s.length();i++){

            if((int)s.charAt(i)==43 && i==0){

                continue;

            }
            if((int)s.charAt(i)==45 && i==0){

                sign=-1;
                continue;

            }

            if(s.charAt(i)<48 || s.charAt(i)>57) return (int)num*sign;

            int n=s.charAt(i)-'0';
            num=num*10+n;


            if(num > Integer.MAX_VALUE ){
                if(sign < 0) return Integer.MIN_VALUE;
                return Integer.MAX_VALUE;
            }


        }

        System.out.println(sign+ " "+ num);
        return (int)num*sign;
    }
}
