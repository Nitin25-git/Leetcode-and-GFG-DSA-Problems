class Solution {
    public boolean search(int[] nums, int target) {
         Arrays.sort(nums);
         boolean a=helper(nums,target);
         return a;

       
        
    }
    public static boolean helper(int[]nums,int target)
    {
         int low=0;
        int high=nums.length-1;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(nums[mid]==target)
            return true;
            if(nums[mid]>target)
                high=mid-1;
            else if(nums[mid]<target)
            low=mid+1;
        }
        return false;
    }
  
}