import java.util.*;

class Solution {
    public int[] twoSum(int[] nums, int target)
     {
           Map<Integer, Integer> hashMap = new HashMap<>();
            for(int i =0;i<nums.length;i++)
            {
                int result = target - nums[i];
                if(hashMap.containsKey(result)){
                    return new int[] {hashMap.get(result),i};
                }

                hashMap.put(nums[i],i);
            }
            return new int[]{0, 0};
}
}