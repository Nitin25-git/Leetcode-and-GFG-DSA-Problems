class Solution {
    public int maxVowels(String s, int k) {
        
        int max=Integer.MIN_VALUE;
        int ans=0;
        
        int start=0;
        for(int i=0;i<k;i++)
        {
            if(check(s.charAt(i)))
            {
                ans=ans+1;
            }
        }
        if(ans==k)
            return k;
        
        max=ans;
        for(int j=k;j<s.length();j++)
        {

            if(check(s.charAt(start)))
               {
                   ans--;
               }
              if(check(s.charAt(j)))
                 ans++;
            
            start++;
                         max=Math.max(max,ans);

        }
                 return max;
                 
                 }
        
        
        
        
        
        
        
        
        public boolean check(char ch)
        {
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
                return true;
            return false;
        }
        
    
}