package LeetCode_Question.Medium;

public class ContainWithMostWater {
    public int maxArea(int[] height) {
        int n=height.length;
        int maxCapacity=0;

        int i=0;
        int j=n-1;

        while(i<j){
            int capacity=(j-i)*Math.min(height[i],height[j]);
            maxCapacity=Math.max(maxCapacity,capacity);

            if(height[j]>height[i] && i<j){
                i++;
            }
            else{
                j--;
            }

        }

        return maxCapacity;
    }
}
