class Solution {
    public String mergeAlternately(String word1, String word2) {
        int c=0,i=0,j=0;
        String word="";
        while(i<word1.length() && j<word2.length())
        {
            
            if(c%2!=0){            
                word=word+word2.charAt(j);
                j++;
                }
                 
            else{
                 word=word+word1.charAt(i);
                i++;
            }

                c++;
            
        }
        while(i<word1.length())
        {
            word=word+word1.charAt(i);
            i++;
        }
        while(j<word2.length())
        {
            word=word+word2.charAt(j);
            j++;
        }
        return word;
    }
}