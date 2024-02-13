class Solution {
    public String reverseWords(String s) {
        s=s.trim();
        int cwe=s.length()-1;
        String str="";
        int i,j;
        
        for(i=cwe;i>=0;i--)
        {
            if(s.charAt(i)==' ')
            {
                int cws=i+1;
                String word="";
                for(j=cws;j<=cwe;j++)
                {
                    word=word+s.charAt(j);
                }
                str=str+word+" ";
                cwe=i-1;
                
            }
        }
         int cws=i+1;
                String word="";
                for(j=cws;j<=cwe;j++)
                {
                    word=word+s.charAt(j);
                }
                str=str+word;
    return str.replaceAll("\\s+"," ").trim();
                
        
    }
}