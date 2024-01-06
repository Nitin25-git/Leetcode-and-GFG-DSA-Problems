class Solution {
    public int rob(int[] nums) {
        int dp[]=new int[101];
        for(int i=0;i<dp.length;i++)
            dp[i]=-1;
        return solve(nums,dp,0);
        
    }
    public int solve(int nums[],int dp[],int i)
    {
        if(i>=nums.length)
            return 0;
        
        if(dp[i]!=-1)
            return dp[i];
        
        int steal=nums[i]+solve(nums,dp,i+2);
        int skip=solve(nums,dp,i+1);
        
        return dp[i]=Math.max(steal,skip);
    }
}