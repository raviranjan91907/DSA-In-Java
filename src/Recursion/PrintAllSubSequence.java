package Recursion;

import java.util.*;

public class PrintAllSubSequence {
    public static List<List<Integer>> subSequence(int i,List<Integer> sequence,List<Integer> temp,List<List<Integer>> ans){
        if(i>=sequence.size()){
            ans.add(new ArrayList<>(temp));
            return ans;
        }

        temp.add(sequence.get(i));
        ans=subSequence(i+1,sequence,temp,ans);
        temp.remove(temp.size()-1);
        ans=subSequence(i+1,sequence,temp,ans);
        return ans;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        List<Integer> sequence=new ArrayList<>();
        for(int i=0;i<n;i++){
            sequence.add(sc.nextInt());
        }

        System.out.println(subSequence(0,sequence,new ArrayList<>(),new ArrayList<>()));

    }
}
