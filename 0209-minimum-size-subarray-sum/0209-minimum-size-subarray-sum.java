class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int sum=0;
        int minl=nums.length+1;
        int i=0;
        int j=0;
        while(j<nums.length)
        {
            sum=sum+nums[j];
            
            while(sum>=target)
            {
                
                minl=Math.min(minl,j-i+1);
                sum=sum-nums[i];
                i++;
            }
            j++;
        }
        
        return minl==nums.length+1?0:minl;
    }
}