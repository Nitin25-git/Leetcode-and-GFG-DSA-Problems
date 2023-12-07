class Solution {
    public void reverseString(char[] s) {
        int start=0;
        int end=s.length-1;
        
        reverseString(s,start,end);
        
        
    }
   public void reverseString(char[] s ,int start ,int end)
   {
       if(start>=end)
           return;
       
       reverseString(s,start+1,end-1);
       
       char temp=s[start];
       s[start]=s[end];
       s[end]=temp;
       
   }
}