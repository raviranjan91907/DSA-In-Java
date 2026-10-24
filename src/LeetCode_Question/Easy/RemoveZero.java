package LeetCode_Question.Easy;

public class RemoveZero {
    public static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public void moveZeroes(int[] nums) {
        int n=nums.length;
        int i=0;
        int j=0;
        while(i<n && j<n){
            while(i<n && nums[i]!=0){
                i++;
            }
            while((j<n && nums[j]==0) || j<=i){
                j++;
            }
            if(i<n && j<n){
                System.out.println(i+" "+j);
                swap(nums,i,j);

            }
            i++;
            j++;

        }

    }
}
