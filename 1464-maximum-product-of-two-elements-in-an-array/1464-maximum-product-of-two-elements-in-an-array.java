class Solution {
    public int maxProduct(int[] nums) {
        int max=Integer.MIN_VALUE;
        int secmax=Integer.MIN_VALUE;
        
        for(int i=0;i<nums.length;i++)
        {
             if(nums[i]>max)
             {
                 secmax=max;
                 max=nums[i];
                 
             }
            else if(secmax<nums[i])
            {
                secmax=nums[i];
            }
        }
        
        return (max-1)*(secmax-1);
        
    }
}

// class Solution {
//     public int maxProduct(int[] nums) {
//         int index=0;
//         int max=Integer.MIN_VALUE;
        
//         for(int i=1;i<nums.length;i++)
//         {
//             max=Math.max(max,(nums[index]-1)*(nums[i]-1));
//             if(nums[index]<nums[i])
//              index=i;
//         }
//         return max;
//     }
// }
        

