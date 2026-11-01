package Arrays;


/*
Kadane's Algorithm in DSA (Java)
Kadane's Algorithm is an efficient algorithm used to find the maximum sum of a contiguous subarray in a given array of integers.

In simple words, it finds a continuous portion of an array whose elements produce the largest possible sum.

It is a popular problem in DSA and is also known as the Maximum Subarray Problem (LeetCode 53).
1. Example
Consider this array:
int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

We need to find the contiguous subarray with the maximum sum.
    -2, 1, -3, 4, -1, 2, 1, -5, 4
    0,  1,  2, 3,  4, 5, 6,  7, 8

Maximum subarray
[4, -1, 2, 1]

6
4 + (-1) + 2 + 1 = 6

The answer is 6.
2. Main concept behind Kadane's Algorithm
Kadane's Algorithm uses two important variables:
1. sum – Stores the sum of the current subarray.
2. maxSum – Stores the maximum sum found so far.
The main logic is:

At every index, decide whether to:
- Continue the previous subarray by adding the current element.
- Start a new subarray from the current element.
The important formula is:
sum = max(arr[i], sum + arr[i])

And update the maximum:
maxSum =max(maxSum, sum)
 */
public class KadanesAlgorithm {
    public int maxSubArray(int[] nums) {

        int sum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {

            sum = Math.max(nums[i], sum + nums[i]);

            maxSum = Math.max(maxSum, sum);
        }

        return maxSum;
    }
}
