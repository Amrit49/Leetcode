package ARRAYS;

class Solution {
    public String gcdOfStrings(String str1, String str2) {
        int len1 = str1.length();
        int len2 = str2.length();

        if(!(str1+str2).equals(str2+str1))
        {
            return "";
        }

        int gcd = gcdResult(len1,len2);

        return str1.substring(0,gcd);
    }

    private int gcdResult(int a,int b)
    {
        while(b != 0)
        {
            int temp = b;
            b = a % b;
            a = temp;
        }

        return a;
    }
}