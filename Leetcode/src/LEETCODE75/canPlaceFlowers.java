package LEETCODE75;

class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0;
        int len = flowerbed.length;

        for(int i = 0;i<len;i++)
        {
            if(flowerbed[i] == 0)
            {
                boolean isPrev = (i == 0) ||(i>0 && flowerbed[i-1] == 0);
                boolean isNext = (i == len -1) || (i<len && flowerbed[i+1] == 0);

                if(isPrev && isNext)
                {
                    flowerbed[i] = 1;
                    count++;

                    if(count >= n)
                    {
                        return true;
                    }
                }
            }
        }
        return count>=n;
    }
}