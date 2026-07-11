class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> s=new Stack<>();
        for(int x:asteroids)
        {
            boolean destroyed=false;
            while(!s.isEmpty() && s.peek()>0 && x<0)
            {
                int top=s.peek();
                if(top<Math.abs(x))
                {
                    s.pop();
                    continue;
                }
                else if(top==Math.abs(x))
                {
                    s.pop();
                }
                destroyed=true;
                break;
            }
            if(!destroyed)
            {
                s.push(x);
            }
        }
        int[] res=new int[s.size()];
        for(int i=s.size()-1;i>=0;i--)
        {
            res[i]=s.pop();
        }
        return res;
    }
}