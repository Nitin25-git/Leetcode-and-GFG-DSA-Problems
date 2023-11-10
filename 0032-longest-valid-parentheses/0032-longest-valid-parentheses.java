class Solution {
    public int longestValidParentheses(String s) {
        
        Stack<Integer> stack=new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch=='(')
                stack.push(i);
            else
            {
                if(!stack.isEmpty() && s.charAt(stack.peek())=='(')
                {
                    stack.pop();
                }
                else
                    stack.push(i);
                    
            }
        }
        int start=0;
        int high=s.length();
        int max=0;
        while(!stack.isEmpty())
        {
            int pop=stack.pop();
            max=Math.max(max,high-pop-1);
            high=pop;
            
        }
        return Math.max(high,max);
    }
}