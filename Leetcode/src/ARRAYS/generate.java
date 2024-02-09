package ARRAYS;
//Pascal tree
import java.util.*;
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();

        List<Integer> row = new ArrayList<Integer>();
        for(int i= 0; i<numRows;++i)
        {
            row = new ArrayList<Integer>();
            for(int j =0;j<=i;++j)
            {
                if(j == 0|| j==i)
                {
                    row.add(1);
                }
                else
                {
                    List<Integer> prev = result.get(i - 1);
                    int sum = prev.get(j-1) + prev.get(j);
                    row.add(sum);
                }
                // prev =row;
                
            }
            result.add(row);

        }
         return result;
    }
}