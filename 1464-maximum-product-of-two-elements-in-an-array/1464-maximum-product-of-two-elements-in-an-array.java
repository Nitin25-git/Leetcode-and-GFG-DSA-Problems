class Solution {
    public int maxProduct(int[] nums) {
        int max=Integer.MIN_VALUE;
        int secmax=Integer.MIN_VALUE;
        
        for(int i=0;i<nums.length;i++)
        {
             if(nums[i]>max)
             {
                 secmax=max;
                 max=nums[i];
                 
             }
            else if(secmax<nums[i])
            {
                secmax=nums[i];
            }
        }
        
        return (max-1)*(secmax-1);
        
    }
}