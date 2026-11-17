package LeetCode_Question.Medium;

public class RearrangeArrayElementsBySign {
    public int[] rearrangeArray(int[] nums) {
        int positiveIdx=0;
        int negetiveIdx=1;

        int ans[]=new int[nums.length];

        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                ans[positiveIdx]=nums[i];
                positiveIdx+=2;
            }
            else{
                ans[negetiveIdx]=nums[i];
                negetiveIdx+=2;
            }
        }

        return ans;
    }
}
