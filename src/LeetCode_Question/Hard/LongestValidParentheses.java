package LeetCode_Question.Hard;

import java.util.*;
public class LongestValidParentheses {
    public int longestValidParentheses(String s) {
        int ans=0;
        Stack<Integer> track=new Stack<>();
        track.push(-1);

        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)=='('){
                track.push(i);
            }
            else{
                track.pop();

                if(track.isEmpty()){
                    track.push(i);
                }
                else{
                    ans=Math.max(ans,i-track.peek());
                }
            }
        }

        return ans;
    }
}
