package LeetCode_Question.Medium;


/*
Given a string s, find the length of the longest substring without duplicate characters.

Example 1:

Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3. Note that "bca" and "cab" are also correct answers.
Example 2:

Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
Example 3:

Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.


Constraints:

0 <= s.length <= 105
s consists of English letters, digits, symbols and spaces.

 */
import java.util.*;
public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        int charMap[]=new int[127];
        int maxCount=0;

        Arrays.fill(charMap,-1);
        int j=0;
        for(int i=0;i<n;i++){
            if(charMap[s.charAt(i)]>=j){
                j=charMap[s.charAt(i)]+1;
            }
            charMap[s.charAt(i)]=i;
            maxCount=Math.max(maxCount,i-j+1);
        }

        return maxCount;

    }

}
