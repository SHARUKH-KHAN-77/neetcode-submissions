class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer>s=new Stack<>();
        for(String x:tokens)
        {
            switch(x)
            {
                case"+":s.push(s.pop()+s.pop());break;
                case"-":int b=s.pop();int a=s.pop();s.push(a-b);break;
                case"*":s.push(s.pop()*s.pop());break;
                case"/":int c=s.pop();int d=s.pop();s.push(d/c);break;
                default:s.push(Integer.parseInt(x));
            }
        }
        return s.peek();
    }
}
