class Solution {
    public void moveZeroes(int[] nums) {
        
        int nzp=0;
        
        
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i]==0 && nums[i+1]!=0)
            {
                int temp=nums[nzp];
                nums[nzp]=nums[i+1];
                nums[i+1]=temp;
                nzp++;
            }
            else if(nums[i]!=0)
                nzp++;
        }
        
        
    }
}