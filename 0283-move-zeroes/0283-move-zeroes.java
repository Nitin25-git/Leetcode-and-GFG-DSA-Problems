class Solution {
    public void moveZeroes(int[] nums) {
        int nzp=0;        
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=0)
            {
                int temp=nums[nzp];
                nums[nzp]=nums[i];
                nums[i]=temp;
                nzp++;
                
            }
        }
        
    }
}