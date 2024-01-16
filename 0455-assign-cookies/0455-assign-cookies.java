class Solution {
    public int findContentChildren(int[] g, int[] s) {
        
        Arrays.sort(g);
        Arrays.sort(s);
        
      int a=g.length;
      int b=s.length;
        int i=0;
        int j=0;
        
        while(i<a && j<b)
        {
          if(g[i]<=s[j])
          {
              i++;
              
          }
            j++;
        }
        
        return i;
        
        
        
        
        
        
    }
}