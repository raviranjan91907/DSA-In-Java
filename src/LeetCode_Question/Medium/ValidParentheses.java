package LeetCode_Question.Medium;

import java.util.*;
public class ValidParentheses {
    public boolean isValid(String s) {
        Stack<Character> track=new Stack<>();

        for(int i=0;i<s.length();i++){
            Character ch=s.charAt(i);
            if(ch=='(' || ch=='{' || ch=='['){
                track.push(s.charAt(i));
            }
            else{
                if(track.isEmpty()) return false;
                Character st=track.peek();
                if(st=='(' && ch==')') track.pop();
                else if(st=='{' && ch=='}') track.pop();
                else if(st=='[' && ch==']') track.pop();
                else{
                    return false;
                }
            }
        }
        return track.isEmpty() ? true: false;
    }
}
