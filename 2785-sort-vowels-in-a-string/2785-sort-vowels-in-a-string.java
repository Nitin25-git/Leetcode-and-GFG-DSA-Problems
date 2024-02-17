class Solution {
    public String sortVowels(String s) {
        StringBuilder str=new StringBuilder();
        for(int i=0;i<s.length();i++)
            {
                char ch=s.charAt(i);
                if(isvowel(ch))
                {
                    str.append(ch);
                }
                
            }
            String vstr=str.toString();
            
            char ch[]=vstr.toCharArray();
        Arrays.sort(ch);
            
         StringBuilder str1=new StringBuilder(s);

            int j=0;
        for(int i=0;i<str1.length();i++)
            {
                char ch1=str1.charAt(i);
                if(isvowel(ch1))
                {
                   str1.setCharAt(i,ch[j]);
                    j++;
                }
            }
            
            return str1.toString();
            }
            
            
            
            
            
            public boolean isvowel(char ch)
            {
            if(ch=='A'|| ch=='E'|| ch=='I'||ch=='O'||ch=='U'||ch=='a'|| ch=='e'|| ch=='i'||ch=='o'||ch=='u')
              return true;
                else
                    return false;
        
            }
}