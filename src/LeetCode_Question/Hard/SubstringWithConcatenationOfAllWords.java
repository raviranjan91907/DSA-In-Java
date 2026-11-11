package LeetCode_Question.Hard;

import java.util.*;
public class SubstringWithConcatenationOfAllWords {
    public List<Integer> findSubstring(String s, String[] words) {
        int wordLength=words[0].length();
        int wordsLength=words.length*wordLength;
        int n=s.length()-(wordsLength)+1;
        // System.out.println(n);

        List<Integer> ans=new ArrayList<Integer>();
        Map<String,Integer> track=new HashMap<>();



        if(n<=0) return new ArrayList<Integer>();



        for(int i=0;i<words.length;i++){
            track.put(words[i], track.getOrDefault(words[i], 0) + 1);
        }


        for(int i=0;i<n;i++){
            int j=i;
            int count=words.length;
            Map<String,Integer> track2=new HashMap<>(track);

            while(j<i+wordsLength){

                String sub = s.substring(j, j+wordLength);
                if(track2.containsKey(sub)){
                    if(track2.get(sub)==0) break;
                    else{
                        track2.put(sub,track2.get(sub)-1);
                        count--;
                        j+=wordLength;
                    }
                }
                else break;

            }

            if(count==0){
                ans.add(i);
            }
        }
        return ans;
    }
}
