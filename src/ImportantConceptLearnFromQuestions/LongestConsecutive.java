package ImportantConceptLearnFromQuestions;

import java.util.*;
public class LongestConsecutive {
    public int longestConsecutive(int[] nums) {

        Set<Integer> temp = new HashSet<>();
        int longest = 0;

        for (int i = 0; i < nums.length; i++) {
            temp.add(nums[i]);
        }

        for (int it : temp) {
            if (!temp.contains(it - 1)) {
                int count = 1;
                int el = it;
                while (temp.contains(el + 1)) {
                    count++;
                    el = el + 1;
                }

                longest = Math.max(longest, count);
            }
        }
        return longest;
    }
}
