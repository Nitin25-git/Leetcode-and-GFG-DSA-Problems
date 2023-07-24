class Solution {
    public int maxSubArray(int[] nums) {
        int maxsum=0;
        int cursum=0;
        
        int c=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>0)
                c++;
        }
        
        if(c>0)
        {
              for(int i=0;i<nums.length;i++)
        {
            cursum=cursum+nums[i];
            if(cursum>maxsum)
            {
                maxsum=cursum;
                
            }
            if(cursum<0)
            {
                cursum=0;
            }
        }
        }
        else
        {
            maxsum=Integer.MIN_VALUE;
            for(int i=0;i<nums.length;i++)
            {
                cursum=nums[i];
                if(cursum>maxsum){
                    maxsum=cursum;
                }
            }
            
        }
      
        return maxsum;
        
    }
}