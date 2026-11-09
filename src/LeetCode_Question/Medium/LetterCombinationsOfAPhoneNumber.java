package LeetCode_Question.Medium;

import java.util.*;
public class LetterCombinationsOfAPhoneNumber {
    public List<String> solve(String digits,Map<Integer,String> keyPad,int q,String word,List<String> ans){
        if(q==digits.length()){
            ans.add(word);
            return ans;
        }

        String key=keyPad.get(digits.charAt(q)-'0');
        for(int i=0;i<key.length();i++){
            ans=solve(digits,keyPad,q+1,word+key.charAt(i),ans);
        }
        return ans;
    }
    public List<String> letterCombinations(String digits) {
        Map<Integer,String> keyPad=new HashMap<>();

        keyPad.put(2,"abc");
        keyPad.put(3,"def");
        keyPad.put(4,"ghi");
        keyPad.put(5,"jkl");
        keyPad.put(6,"mno");
        keyPad.put(7,"pqrs");
        keyPad.put(8,"tuv");
        keyPad.put(9,"wxyz");

        List<String> ans=new ArrayList<>();
        ans=solve(digits,keyPad,0,"",ans);
        return ans;
    }
}
