class Solution {
    public int rob(int[] nums) {
        int dp[]=new int[101];
        for(int i=0;i<dp.length;i++)
            dp[i]=-1;
        return solve(nums,0,dp);
        
        
    }
    public int solve(int nums[],int i,int dp[])
    {
        if(i>=nums.length)
            return 0;
        
        if(dp[i]!=-1)
            return dp[i];
        
        int steal=nums[i]+solve(nums,i+2,dp);
        int skip=solve(nums,i+1,dp);
        
        return dp[i]=Math.max(steal,skip);
    }
}