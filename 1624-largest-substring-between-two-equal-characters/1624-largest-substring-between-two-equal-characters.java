class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        
        int n=s.length();
        int count[]=new int[26];
        Arrays.fill(count,-1);
        
        int max=-1;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(count[ch-'a']==-1)
            {
                count[ch-'a']=i;
            }
            
            else
            {
                max=Math.max(max,i-count[ch-'a']-1);
            }
        }
        
        return max;
        
    }
}