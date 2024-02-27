class Solution {
    public int maxSubArray(int[] nums) {
        int maxsum=0;
        int count=0;
        int currsum=0;
        
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>0)
                count++;
        }
        if(count>0)
        {
            for(int i=0;i<nums.length;i++)
            {
               currsum=currsum+nums[i];
                if(currsum>maxsum)
                {
                    maxsum=Math.max(currsum,maxsum);
                }
                else if(currsum<0)
                {
                    currsum=0;
                }
            }
            return maxsum;
        }
        int max1=Integer.MIN_VALUE;
         if(count<=0)
        {
            for(int i=0;i<nums.length;i++)
            {
                if(nums[i]>max1)
                {
                    max1=Math.max(max1,nums[i]);
                }
            }
        }
        return max1;
        
        
    }
}