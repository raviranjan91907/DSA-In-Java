package LeetCode_Question.Medium;


import java.util.*;
public class ThreeSumClosest {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int minDistance=Integer.MAX_VALUE;
        int closestSum=Integer.MAX_VALUE;


        for(int i=0;i<nums.length;i++){
            int j=i+1;
            int q=nums.length-1;
            while(j<q){
                int valueSum=nums[i]+nums[j]+nums[q];
                if(valueSum<target) j++;
                else if(valueSum>target) q--;
                else{
                    j++;
                    q--;
                }

                int distanceValue=Math.abs(target-valueSum);


                if(distanceValue<minDistance){
                    closestSum=valueSum;
                    minDistance=distanceValue;
                }

            }

        }

        return closestSum;
    }
}
