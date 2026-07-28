class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int currmax=0,max=nums[0];
        int currmin=0,min=nums[0];
        int total=0;
        for(int x:nums)
        {
            currmax=Math.max(currmax+x,x);
            max=Math.max(currmax,max);
            currmin=Math.min(currmin+x,x);
            min=Math.min(currmin,min);
            total+=x;
        }
        if(max<0)
        {
            return max;
        }
        return Math.max(max,total-min);
    }
}