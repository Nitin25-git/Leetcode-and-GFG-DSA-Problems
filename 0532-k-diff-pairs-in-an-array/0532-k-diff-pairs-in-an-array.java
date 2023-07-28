class Solution {
    public int findPairs(int[] nums, int k) {
        Arrays.sort(nums);
        
       int count=0;
        int i=0;
        int j=1;
        while(i<nums.length && j<nums.length)
        {

             if(nums[j]-nums[i]==k)
             {
                count+=1;
                 i++;
                 j++;
                 while(j<nums.length && nums[j]==nums[j-1])
                 {
                     j++;
                 }
                
             }
            else if(nums[j]-nums[i]<k)
                j++;
            else if(nums[j]-nums[i]>k)
            {
                i++;
                if(i==j)
                    j++;
            }
          
        }
        return count;
        
        
    }
}