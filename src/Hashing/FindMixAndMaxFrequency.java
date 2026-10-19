package Hashing;

import java.util.*;
import java.util.stream.Gatherer;

public class FindMixAndMaxFrequency {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        List<Integer> arr=new ArrayList<>();
        Map<Integer,Integer> track=new HashMap<>();
        for(int i=0;i<n;i++){
            arr.add(sc.nextInt());
            track.put(arr.get(i),track.containsKey(arr.get(i)) ? track.get(arr.get(i))+1: 1);
        }


        int mx=arr.get(0);
        int min=arr.get(0);

        for(Map.Entry<Integer,Integer> entry:track.entrySet()){
            if(entry.getValue()<=track.get(min)) min=entry.getKey();
            if(entry.getValue()>=track.get(mx)) mx=entry.getKey();
        }

        System.out.println(mx+" -> " + track.get(mx));
        System.out.println(min+" -> "+ track.get(min));
    }
}
