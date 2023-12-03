class Solution {
    public int majorityElement(int[] nums) {
        int mi=0;
        int count=1;
        for(int i=1;i<nums.length;i++)
        {
            if(nums[mi]==nums[i])
                count++;
            else
                count--;
            
            if(count==0)
            {
                mi=i;
                count=1;
            }
        }
        return nums[mi];
        
    }
}