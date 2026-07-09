class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalG=0;
        int totalC=0;
        int currentTank=0;
        int start=0;
        for(int i=0;i<gas.length;i++)
        {
            totalG+=gas[i];
            totalC+=cost[i];
            currentTank+=gas[i]-cost[i];
            if(currentTank<0)
            {
                start=i+1;
                currentTank=0;
            }
        }
        return totalG>=totalC?start:-1;
    }
}
