class Solution {
    public int maxProfit(int[] prices) {
        int max=0;
        int min=Integer.MAX_VALUE;
        for(int x:prices)
        {
            if(x<min)
            {
                min=x;
            }
            else if(x-min>max)
            {
                max=x-min;
            }
        }
        return max;
    }
}
