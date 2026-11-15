package LeetCode_Question.Medium;

import java.util.*;
public class FourSum {
    Set<List<Integer>> solve(int[] nums,int target,int i,List<Integer> temp,int count,Set<List<Integer>> ans,int sum){
        if(count==4){
            if(sum==target){
                ans.add(new ArrayList<>(temp));
                return ans;
            }
        }

        if(i==nums.length){
            return ans;
        }

        temp.add(nums[i]);
        ans=solve(nums,target,i+1,temp,count+1,ans,sum+nums[i]);
        temp.remove(temp.size()-1);
        ans=solve(nums,target,i+1,temp,count,ans,sum);
        return ans;
    }
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<Integer> temp=new ArrayList<>();
        Set<List<Integer>> ans=new HashSet<>();

        ans=solve(nums,target,0,temp,0,ans,0);
        return new ArrayList<>(ans);

    }
}
