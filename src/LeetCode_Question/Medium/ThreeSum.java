package LeetCode_Question.Medium;

import java.util.*;
public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {

        int n=nums.length;
        Arrays.sort(nums);
        Set<List<Integer>> temp=new HashSet<>();


        for(int i=0;i<n-2;i++){
            int j=i+1;
            int q=n-1;
            int target=0-nums[i];
            while(j<q){
                if(target>(nums[j]+nums[q])) j++;
                else if(target<(nums[j]+nums[q])) q--;




                else{
                    temp.add(new ArrayList<>(List.of(nums[i],nums[j],nums[q])));
                    j++;
                    q--;
                }
            }a
        }

        List<List<Integer>> ans=new ArrayList<>(temp);
        return ans;

    }
}
