class Solution {
    int dp[]=new int[46];
    public int climbStairs(int n) {
        for(int i=0;i<dp.length;i++)
            dp[i]=-1;
          return help(0,n);
        
        
    }
    
    public int help(int i ,int n)
    {
        if(i>n)
            return 0;
        if(i==n)
            return 1;
        if(dp[i]!=-1)
            return dp[i];
        int op1=help(i+1,n);
        int op2=help(i+2,n);
        
        dp[i]=op1+op2;
        return dp[i];
        
    }
}