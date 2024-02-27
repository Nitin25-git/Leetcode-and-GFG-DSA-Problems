class Solution {
    public int pivotIndex(int[] nums) {
        int i,j;
        int leftsum,rightsum;
        for(i=0;i<nums.length;i++)
        {
            leftsum=0;
            for(j=0;j<i;j++)
            {
                leftsum+=nums[j];
            }
            rightsum=0;
            for(int k=i+1;k<nums.length;k++)
            {
                rightsum+=nums[k];
            }
            if(leftsum==rightsum)
                return i;
        }
        return -1;
    }
}