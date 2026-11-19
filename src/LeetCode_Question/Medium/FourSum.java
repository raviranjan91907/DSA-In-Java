package LeetCode_Question.Medium;

import java.util.*;
public class FourSum {
    public List<List<Integer>> fourSum(int[] nums, int target) {

        Arrays.sort(nums);
        List<List<Integer>> ans=new ArrayList<>();
        int n=nums.length;

        for(int i=0;i<n-3;i++){

            if (i > 0 && nums[i] == nums[i - 1]) continue;

            for(int j=i+1;j<n-2;j++){

                if (j > i + 1 && nums[j] == nums[j - 1]) continue;

                int q=j+1;
                int k=n-1;
                while(q<k){
                    long valueSum=(long)nums[i]+nums[j]+nums[q]+nums[k];
                    if(valueSum>target){
                        k--;
                    }
                    else if(valueSum<target){
                        q++;
                    }
                    else{
                        // System.out.println(i+" "+j+" "+q+" "+k+" "+valueSum);
                        ans.add(List.of(nums[i],nums[j],nums[q],nums[k]));
                        q++;
                        k--;

                        while (q < k && nums[q] == nums[q - 1]) q++;
                        while (q < k && nums[k] == nums[k + 1]) k--;
                    }
                }
            }
        }

        return ans;

    }
}
