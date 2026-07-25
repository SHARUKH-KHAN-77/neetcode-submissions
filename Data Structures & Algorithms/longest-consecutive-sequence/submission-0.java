class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set=new HashSet<>();
        for(int x:nums)
        {
            set.add(x);
        }
        int longest=0;
        int currstreak=0;
        for(int x:nums)
        {
            if(!set.contains(x-1))
            {
                int curr=x;
                currstreak=1;
                while(set.contains(curr+1))
                {
                    curr+=1;
                    currstreak+=1;
                }
            }
            longest=Math.max(longest,currstreak);
        }
        return longest;
    }
}
