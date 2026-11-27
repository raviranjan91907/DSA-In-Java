package LeetCode_Question.Easy;

public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {

        s=s.trim();

        int i=s.length()-1;
        while(i>=0){
            if(s.charAt(i)==' '){
                break;
            }
            i--;
        }

        return (s.length()-1)-i;
    }
}
