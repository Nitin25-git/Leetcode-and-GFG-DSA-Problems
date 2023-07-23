class Solution {
    public int removeElement(int[] nums, int val) {
        int index=0;
        int length=nums.length;
        for(int i=0;i<length;i++)
        {
            if(nums[i]!=val)
            {
                nums[index]=nums[i];
                index++;
            }
        }
        return index;
        
    }
}