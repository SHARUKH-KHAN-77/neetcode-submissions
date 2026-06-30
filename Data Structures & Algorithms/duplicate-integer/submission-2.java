class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> flag=new HashSet<>();
        for(int x:nums)
        {
            if (flag.contains(x))
            {
                return true;
            }
            flag.add(x);
        }
        return false;
    }
}