class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int last=nums.length;
        int sumN=(last*(last+1))/2;
        int sum=0;
        for(int i:nums)
        {
            sum+=i;
        }
        
        return sumN-sum;
        
        
    }
}