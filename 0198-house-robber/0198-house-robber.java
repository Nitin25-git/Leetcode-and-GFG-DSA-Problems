class Solution {
    public int rob(int[] nums) {
        int dp[]=new int[nums.length+1];
        
        dp[0]=0;
        dp[1]=nums[0];
        
        for(int i=2;i<=nums.length;i++)
        {
            int steal=nums[i-1]+dp[i-2];
            int skip=dp[i-1];
            
            dp[i]=Math.max(steal,skip);
        }
        
        return dp[nums.length];
        
    }
}