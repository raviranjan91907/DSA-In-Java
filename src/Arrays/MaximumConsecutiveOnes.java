package Arrays;

import java.util.*;
public class MaximumConsecutiveOnes {
    public static int maxConsecutiveOnes(List<Integer> arr){
        int count=0;
        int maxCount=0;
        for(int i=0;i<arr.size();i++){
            if(arr.get(i)==0){
                count=0;
                continue;
            }
            count++;
            maxCount=Math.max(count,maxCount);
        }
        return maxCount;
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        List<Integer> arr=new ArrayList<>();
        for(int i=0;i<n;i++){
            arr.add(sc.nextInt());
        }

        System.out.println(maxConsecutiveOnes(arr));
    }
}
