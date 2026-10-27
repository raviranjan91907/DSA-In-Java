package Arrays;

import java.util.*;
public class LengthOfLongestSubArrayWithSumK {
    public static int longestSubArray(List<Integer> arr,int target){
        Map<Integer,Integer> track=new HashMap<>();
        int sum=0;
        int maxLen=0;
        for(int i=0;i<arr.size();i++){
            sum+=arr.get(i);
            if(sum==target){
                maxLen=Math.max(maxLen,i+1);
            }

            int part=sum-target;

            if(track.containsKey(part)){
                int len=i-track.get(part);
                maxLen=Math.max(maxLen,len);
            }

            if(!track.containsKey(sum)){
                track.put(sum,i);
            }
        }
        return maxLen;
    }

    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        int target=sc.nextInt();
        int n=sc.nextInt();

        List<Integer> arr=new ArrayList<>();

        for(int i=0;i<n;i++){
            arr.add(sc.nextInt());
        }

        System.out.println(longestSubArray(arr,target));
    }
}
