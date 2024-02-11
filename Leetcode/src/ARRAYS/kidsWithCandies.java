package ARRAYS;
import java.util.*;
class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maxCandies =0;
        for(int i =0;i<candies.length;i++)
        {
            if(maxCandies <= candies[i])
            {
                maxCandies = candies[i];
            }
        }

        ArrayList<Boolean> result = new ArrayList<>();
        for(int i=0;i<candies.length;i++)
        {
            int sum = extraCandies + candies[i];
            if(sum >= maxCandies)
            {
                result.add(true);
            }
            else
            {
                result.add(false);
            }
        }
        return result;
    }
}