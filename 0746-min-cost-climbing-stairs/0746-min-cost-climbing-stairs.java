class Solution {
    
            int dp[]=new int[1001];

    public int minCostClimbingStairs(int[] cost) {

        for(int i=0;i<dp.length;i++)
        {
            dp[i]=-1;
        }
        int op1=help(0,cost);
        int op2=help(1,cost);
     return Math.min(op1,op2);
    }
    public int help(int i,int [] cost)
    {
        
        if(i>=cost.length)
            return 0;
        
        if(dp[i]!=-1)
            return dp[i];
        int total=cost[i];
        int total1=help(i+1,cost);
        int total2=help(i+2,cost);
         total=total+Math.min(total1,total2);        
      dp[i]=total;
        return dp[i];
    }
}