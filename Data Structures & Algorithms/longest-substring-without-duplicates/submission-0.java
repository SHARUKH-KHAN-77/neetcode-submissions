class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] seen=new int[128];
        for(int i=0;i<128;i++)
        {
            seen[i]=-1;
        }
        int max=0;
        int left=0;
        for(int right=0;right<s.length();right++)
        {
            char current=s.charAt(right);
            if(seen[current]>=left)
            {
                left=seen[current]+1;
            }
            seen[current]=right;
            max=Math.max(max,right-left+1);
        }
        return max;
    }
}
