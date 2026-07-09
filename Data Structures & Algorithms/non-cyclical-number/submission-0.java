class Solution {
    public boolean isHappy(int n) {
        int fast=n;
        int slow=n;
        do
        {
            slow=getNext(slow);
            fast=getNext(getNext(fast));
        }while(slow!=fast);
        return slow==1;
    }
    public int getNext(int n)
    {
        int s=0;
        while(n>0)
        {
            int d=n%10;
            s=s+(d*d);
            n=n/10;
        }
        return s;
    }

}
