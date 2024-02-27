class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left=0;
        int right=numbers.length-1;
        while(left<=right)
        {
            int sum=numbers[left]+numbers[right];
            if(numbers[left]+numbers[right]==target)
                return new int[]{left+1,right+1};
            else if(sum>target)
            {
                right=right-1;
            }
            else
            {
                left=left+1;
            }
        }
        return new int[]{0,0};
        
    }
}