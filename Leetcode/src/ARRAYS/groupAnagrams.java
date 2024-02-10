package ARRAYS;
import java.util.*;


/*sorting and hashmap
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs == null)
        {
            return new ArrayList<>();
        }

        Map<String,List<String>> anagramMap = new HashMap<>();
        for(String s:strs)
        {
            char[] array  = s.toCharArray();
            Arrays.sort(array);
            String key = String.valueOf(array);

            if(!anagramMap.containsKey(key))
            {
                anagramMap.put(key,new ArrayList<>());
            }

            anagramMap.get(key).add(s);
        } 

        List<List<String>> resultList = new ArrayList<>();

        for(Map.Entry<String,List<String>> stringAnagrams : anagramMap.entrySet())
        {
            resultList.add(stringAnagrams.getValue());
        }

        return resultList;
        
    }
}
 */

 //categorizing by frequency

 class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs == null)
        {
            return new ArrayList<>();
        }

        Map<String,List<String>> frequencyString = new HashMap<>();
        for(String s:strs)
        {
           String frequency = getFrequency(s);

           if(frequencyString.containsKey(frequency))
           {
               frequencyString.get(frequency).add(s);
           }
           else
           {
               List<String> strList = new ArrayList<>();
               strList.add(s);
               frequencyString.put(frequency,strList);
           }
        } 

        return new ArrayList<>(frequencyString.values());
    }


    private String getFrequency(String str)
    {
        int[] freq = new int[30];
        for(char c: str.toCharArray())
        {
            freq[c- 'a']++;
        }

        StringBuilder frequency = new StringBuilder("");
        char c = 'a';
        for(int i : freq){
            frequency.append(c);
            frequency.append(i);
            c++;
        }
        return frequency.toString();
    }
}