class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int start=0;
        int end=nums.length-1;
        int sum=0;
        int result=Integer.MIN_VALUE;
        while(start<end)
        {
            sum=nums[start]+nums[end];
            result=Math.max(result,sum);
            
            start++;
            end--;
        }
        return result;
    }
}

