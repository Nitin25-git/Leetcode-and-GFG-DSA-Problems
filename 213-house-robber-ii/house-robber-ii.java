class Solution {
    public int rob(int[] nums) {
        
        if(nums.length==1)
            return nums[0];
        
        if(nums.length==2)
            return Math.max(nums[0],nums[1]);
        
        int dp[]=new int[101];
        for(int i=0;i<dp.length;i++)
              dp[i]=-1;
        int n=nums.length;
        
     int ans1= solve(nums,0,dp,n-2);
        for(int i=0;i<dp.length;i++)
              dp[i]=-1;
        
     int ans2= solve(nums,1,dp,n-1);

        return Math.max(ans1,ans2);
        
        
    }
    public int solve(int nums[],int i,int dp[],int n)
    {
        
        if(i>n)
            return 0;
        
        if(dp[i]!=-1)
            return dp[i];
        
        int steal=nums[i]+solve(nums,i+2,dp,n);
        int skip=solve(nums,i+1,dp,n);
        
     
        
        return dp[i]=Math.max(steal,skip);
    }
}