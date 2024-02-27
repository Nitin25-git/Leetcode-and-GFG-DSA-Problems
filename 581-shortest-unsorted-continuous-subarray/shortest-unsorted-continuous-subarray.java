class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int low=0;
        int high=nums.length-1;
        while(low+1<nums.length && nums[low]<=nums[low+1])
            low++;
        while(high-1>=0 && nums[high]>=nums[high-1])
            high--;
        if(low==nums.length-1)
            return 0;
        int wmax=Integer.MIN_VALUE;
        int wmin=Integer.MAX_VALUE;
        for(int i=low;i<=high;i++)
        {
            wmin=Math.min(wmin,nums[i]);
            wmax=Math.max(wmax,nums[i]);
        }
        
        while(low-1>=0 && nums[low-1]>wmin)
        {
            low--;
        }
        while(high+1<nums.length && nums[high+1]<wmax)
        {
            high++;
        }
        return high-low+1;
        
    }
}