class Solution {
    
    
    public boolean compare(String haystack,String needle,int index)
    {
        int n1=haystack.length();
        int n2=needle.length();
        for(int i=0;i<n2;i++)
        {
            if(index>=n1)
                 return false;
            if(haystack.charAt(index)!=needle.charAt(i))
                return false;
            index++;
        }
        return true;
    }
    public int strStr(String haystack, String needle) {
        
        
        int n1=haystack.length();
        
        for(int i=0;i<n1;i++)
        {
            if(haystack.charAt(i)==needle.charAt(0))
            {
                if(compare(haystack,needle,i))
                  return i;
            }
            
        }
        
        return -1;
    }
}