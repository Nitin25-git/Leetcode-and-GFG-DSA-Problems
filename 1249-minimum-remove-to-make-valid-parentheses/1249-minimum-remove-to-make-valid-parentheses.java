class Solution {
    public String minRemoveToMakeValid(String s) {
        Stack<Integer> stack=new Stack<>();
        StringBuilder str=new StringBuilder(s);
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='(')
                stack.push(i);
            else if(s.charAt(i)==')')
            {
                if(!stack.isEmpty() && s.charAt(stack.peek())=='(')
                {
                    stack.pop();
                }
                else
                {
                    stack.push(i);
                }
            }
        }
    while(!stack.isEmpty())
        {
            int index=stack.pop();
            str.deleteCharAt(index);
        }
        
        return str.toString();
        
        
    }
}