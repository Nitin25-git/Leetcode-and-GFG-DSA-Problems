class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> stack=new Stack<>();
        String str="";
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(stack.isEmpty())
              stack.push(ch);
            else
            {
                if(stack.peek()==ch)
                {
                    stack.pop();
                }
                else
                {
                    stack.push(ch);
                }
            }
        }
        for(char ch:stack)
        {
            str=str+ch;
        }
        return str;
        
    }
}