package LeetCode_Question;


/*
You are given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
You can return the answer in any order.

Example 1:
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
 */

import java.util.*;
public class Two_Sum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> track=new HashMap<>();

        for(int i=0;i<nums.length;i++){
            int r=target-nums[i];
            if(track.containsKey(r)){
                return new int[] {i,track.get(r)};
            }
            else{
                track.put(nums[i],i);
            }
        }
        return new int[]{};
    }
}
