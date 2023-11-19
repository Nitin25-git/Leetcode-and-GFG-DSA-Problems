class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        
        if(nums.length>1)
        {
        int odd=1;
        int i=0;
            while(i<nums.length && odd<nums.length)
        {
            if(nums[i]%2!=0 && nums[odd]%2==0)
            {
                int temp=nums[odd];
                nums[odd]=nums[i];
                nums[i]=temp;
                odd+=2;
                i+=2;
            }
            else 
            {if(nums[odd]%2!=0)
                odd+=2;
             if(nums[i]%2==0)
                i+=2;
            }
        }
            
    }
        return nums;
    }
}