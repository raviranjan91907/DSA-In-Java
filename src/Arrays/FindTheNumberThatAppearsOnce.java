package Arrays;

import java.util.*;
public class FindTheNumberThatAppearsOnce {
    public static int findNumber(List<Integer>arr){
        int xor=0;
        for(int i=0;i<arr.size();i++){
            xor=xor^arr.get(i);
        }
        return xor;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        List<Integer> arr=new ArrayList<>();
        for(int i=0;i<n;i++){
            arr.add(sc.nextInt());
        }

        System.out.println(findNumber(arr));
    }
}
