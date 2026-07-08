class Solution {
    public int maxArea(int[] heights) {
        int low=0;
        int high=heights.length-1;
        int max=0;
        while(low<high)
        {
            int width=high-low;
            int h=Math.min(heights[low],heights[high]);
            max=Math.max(max,width*h);
            if(heights[low]<heights[high])
            {
                low++;
            }
            else
            {
                high--;
            }
        }
        return max;
    }
}
