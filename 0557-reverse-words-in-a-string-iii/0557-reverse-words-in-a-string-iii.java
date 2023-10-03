class Solution {
    public String reverseWords(String s) {
        int n=s.length();
        int start=0;
        int end=0;;
        String ans="";
        String revword="";
        int i=0;
        for( i=0;i<n;i++)
        {
            if(s.charAt(i)==' ')
            {
                end=i;
                String small="";
                for(int j=start;j<end;j++)
                {
                 small=s.charAt(j)+small;   
                }
                start=end+1;
                ans=ans+small+" ";
            }
        }
        String small="";
          for(int j=start;j<i;j++)
                {
                 small=s.charAt(j)+small;   
                }
                start=end+1;
        ans=ans+small;
                
        
        return ans;
        
        
    }
}