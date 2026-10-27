package LeetCode_Question.Medium;

import java.util.*;
public class SubarraySumEqualToK {
    public int subarraySum(int[] nums, int k) {
        Map<Integer,Integer> track=new HashMap<>();

        int sum=0;
        int count=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            int x=sum-k;

            if(sum==k){
                count++;
            }
            if(track.containsKey(x)){
                count+=track.get(x);
            }
            track.put(sum, track.getOrDefault(sum, 0) + 1);
        }

        return count;
    }
}
