class Solution {
    public boolean isSubsequence(String s, String t) {
        int a=0;
        int b=0;
        if(s.length()==0)
            return true;
        while(b<t.length())
        {
            if(s.charAt(a)==t.charAt(b))
                a++;
            if(a==s.length())
                return true;
            
            b++;
        }
        return false;
    }
}