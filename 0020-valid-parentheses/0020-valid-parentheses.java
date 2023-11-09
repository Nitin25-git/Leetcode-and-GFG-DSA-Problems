class Solution {
    public boolean isValid(String s) {
        
        Stack<Character> stack=new Stack<Character>();
        for (int j=0;j<s.length();j++)
        {
            char i=s.charAt(j);
            if (i=='[' || i=='{' || i=='(')
            {
                stack.push(i);
            }
            else 
            {
                if (stack.isEmpty())
                    return false;
                
                else
                {
                    if (i==']')
                    {
                        if (stack.peek()!='[')
                            return false;
                        else
                            stack.pop();
                    }
                    
                    else if (i=='}')
                    {
                        if (stack.peek()!='{')
                            return false;
                        else
                            stack.pop();
                    }
                    
                    else if (i==')')
                    {
                        if (stack.peek()!='(')
                            return false;
                        else
                            stack.pop();
                    }
                }
            }
            
        }
        return stack.isEmpty();
    }
}