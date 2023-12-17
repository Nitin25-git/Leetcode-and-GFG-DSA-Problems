class Solution {
    public int countCharacters(String[] words, String chars) {
        int freq[]=new int[26];
        int sum=0;
        for(char ch:chars.toCharArray())
        {
            freq[ch-'a']++;
        }
        
        for(String word:words)
        {
            int freq2[]=new int[26];
            for(char ch1:word.toCharArray())
            {
                freq2[ch1-'a']++;
            }
            
            boolean ans=true;
            for(int i=0;i<26;i++)
            {
              if(freq2[i]>freq[i])
              {
                  ans=false;
                  break;
              }
            }
            
            if(ans)
                sum=sum+word.length();
        }
        
        return sum;
        
        
    }
}