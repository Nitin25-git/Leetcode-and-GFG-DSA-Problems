class Solution {
    public char findTheDifference(String s, String t) {
        
        
        int freq1[]=new int[256];
        
        for(int i=0;i<t.length();i++)
        {
            freq1[t.charAt(i)]++;
        }
        for(int i=0;i<s.length();i++ )
        {
            freq1[s.charAt(i)]--;
        }
        
        for(int i=0;i<freq1.length;i++)
        {
            if(freq1[i]>0)
            {
                return (char)i;
            }
        }
        return '\u0000';
        
        
        
    }
}