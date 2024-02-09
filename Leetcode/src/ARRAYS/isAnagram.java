package ARRAYS;

import java.util.*;
/*bruteforce 
class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        char[] tChars = t.toCharArray();
        
        for (char c : s.toCharArray()) {
            int index = -1;
            for (int i = 0; i < tChars.length; i++) {
                if (tChars[i] == c) {
                    index = i;
                    break;
                }
            }
            if (index == -1) {
                return false;
            }
            tChars[index] = '\0';
        }
        return true;
    }
}
*/

/*using sorting
 class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        boolean isAnagram = true;
        char[] sChar = s.toCharArray();
        char[] tChar = t.toCharArray();

        Arrays.sort(sChar);
        Arrays.sort(tChar);

        for(int i =0 ;i<sChar.length;i++)
        {
            if(sChar[i] != tChar[i])
            {
                isAnagram = false;
                break;
            }
        }
        if(isAnagram)
        {
            return true;
        }

        return false;
    }
}
 */
// USING HASHMAP
 class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        boolean isAnagram = true;
        Map<Character,Integer> sMap = new HashMap();
        Map<Character,Integer> tMap = new HashMap();

        for(int i = 0;i<s.length();i++)
        {
            sMap.put(s.charAt(i),sMap.getOrDefault(s.charAt(i),0)+1);
        }
        
        for(int i = 0;i<t.length();i++)
        {
            tMap.put(t.charAt(i),tMap.getOrDefault(t.charAt(i),0)+1);
        }

        return sMap.equals(tMap);
    }
}

