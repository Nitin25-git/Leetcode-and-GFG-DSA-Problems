class Solution {
    public double findMaxAverage(int[] nums, int k) {
       
        double maxsum=0;
        for(int i=0;i<k;i++)
        {
            maxsum+=nums[i];
        }
        double windowsum=maxsum;
        for(int i=k;i<nums.length;i++)
        {
            windowsum+=nums[i]-nums[i-k];
            maxsum=Math.max(maxsum,windowsum);
        }
        return (maxsum/k);
        
    }
}