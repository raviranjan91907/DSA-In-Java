package Arrays;

/*
    The Dutch National Flag Algorithm is an efficient algorithm used to sort an array containing only three different values, usually 0, 1, and 2, in ascending order.

    1. Basic idea
    Suppose we have this array:
    int[] arr = {2, 0, 2, 1, 1, 0};


    We want to sort it into:
    {0, 0, 1, 1, 2, 2}

    Instead of using a sorting algorithm like bubble sort, we can solve this problem in one pass using three pointers.
    2. Three pointers
    We use three variables:
    - low — the position where the next 0 should go.
    - mid — the current element we are checking.
    - high — the position where the next 2 should go.

    3. Three rules to remember
    At every step, check arr[mid].
    Condition	Action
    arr[mid] == 0	Swap arr[low] and arr[mid]. Increment low and mid.
    arr[mid] == 1	Increment mid.
    arr[mid] == 2	Swap arr[mid] and arr[high]. Decrement high.

    6. Time and space complexity
    - Time complexity: \(O(N)\) — each element is processed in a single pass.
    - Space complexity: \(O(1)\) — only three pointers and one temporary variable are used; the array is sorted in place.
    Remember this simple rule: 0 goes to the left, 1 stays in the middle, and 2 goes to the right. The mid pointer decides what to do with each element.
*/


public class DutchNationalFlagAlgorithm {
    public void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public void sortColors(int[] nums) {
        int low=0;
        int mid=0;
        int high=nums.length-1;

        while(mid<=high){
            if(nums[mid]==0){
                swap(nums,mid,low);
                low++;
                mid++;
            }
            else if(nums[mid]==1){
                mid++;
            }
            else{
                swap(nums,mid,high);
                high--;
            }
        }

    }
}
