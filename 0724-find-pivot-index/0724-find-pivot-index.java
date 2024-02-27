class Solution {
    public int pivotIndex(int[] nums) {
        int leftsum=0;
        int sum=0;
        for(int i:nums)
        {
            sum+=i;
        }
        for(int i=0;i<nums.length;i++)
        {
            sum=sum-nums[i];
            if(leftsum==sum)
                return i;
            
            leftsum+=nums[i];
        }
        return -1;
        
    }
}