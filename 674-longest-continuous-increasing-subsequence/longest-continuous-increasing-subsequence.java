class Solution {
    public int findLengthOfLCIS(int[] nums) {
        if(nums.length<=1)
            return nums.length;
        
         int n=nums.length;
        // boolean increasing=false;
        
        // int start=0;
        // int end=0;
        int c=1;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n-1;i++)
        {
            
            if(nums[i]<nums[i+1])
            {
                c++;

            }
            else
            {
                c=1;
                
            }
             max=Math.max(c,max);


                
        }
        return max>0?max:1;
        
    }
}