package LeetCode_Question.Medium;

import java.util.*;
public class GenerateParentheses {
    List<String> solve(int n,int right,int left,String pthes,List<String> ans,int count){
        if(right==n && left==n){
            String a=pthes;
            ans.add(a);
            return ans;
        }

        if(right<n){
            ans=solve(n,right+1,left,pthes+'(',ans,count);
        }

        if(left<n && left<right){
            ans=solve(n,right,left+1,pthes+')',ans,count);
        }
        return ans;
    }
    public List<String> generateParenthesis(int n) {
        List<String> ans=new ArrayList<>();
        return solve(n,0,0,"",ans,0);

    }
}
