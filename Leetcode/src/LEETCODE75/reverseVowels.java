package LEETCODE75;

class Solution {
    public String reverseVowels(String s) {
        char[] array = s.toCharArray();
        String vowels = "aeiouAEIOU";
        int i =0;
        int j= s.length()-1;

        while(i<j)
        {
            while(i <j && vowels.indexOf(array[i]) == -1)
            {
                i++;
            }
            while(i <j && vowels.indexOf(array[j]) == -1)
            {
                j--;
            }
            char temp = array[i];
            array[i] = array[j];
            array[j] = temp;

            i++;
            j--;
        }
        return new String(array);
    }
}