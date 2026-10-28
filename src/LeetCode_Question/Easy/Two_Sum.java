package LeetCode_Question.Easy;


/*
You are given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
You can return the answer in any order.

Example 1:
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

9
4
2 7 11 15

6
3
3 2 4
 */

import java.util.*;

public class Two_Sum {

    public static int[] towSumTwoPointer(int []nums,int target){

        List<Integer> list=Arrays.stream(nums)
                .boxed()
                .toList();

        int arr[]=Arrays.stream(nums)
                .sorted()
                .toArray();



        int i=0;
        int j=nums.length-1;

        while(i<j){
            int sum=arr[i]+arr[j];
            if(sum==target){
                return new int[] {list.indexOf(arr[i]),list.indexOf(arr[j])};
            }

            if(sum<target){
                i++;
            }
            else{
                j--;
            }
        }
        return new int[]{};
    }


    public static int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> track=new HashMap<>();

        for(int i=0;i<nums.length;i++){
            int r=target-nums[i];
            if(track.containsKey(r)){
                return new int[] {i,track.get(r)};
            }
            else{
                track.put(nums[i],i);
            }
        }
        return new int[]{};
    }


    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int target=sc.nextInt();
        int n=sc.nextInt();

        int arr[]=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(towSumTwoPointer(arr, target)));
        System.out.println(Arrays.toString(twoSum(arr, target)));
    }
}
