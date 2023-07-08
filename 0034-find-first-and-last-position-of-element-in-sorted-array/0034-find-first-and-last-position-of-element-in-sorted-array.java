class Solution
 {
    public int[] searchRange(int[] nums, int target) 
 {
       int start=0;
       int end=nums.length-1;
        int c=0;
      if(nums.length==0)
       return new int[] {-1,-1};
       while(start<=end)
    {
        int mid=(start+end)/2;
       if(nums[mid]<target)
       {
          start=mid+1;
       }
       else if(nums[mid]>target)
       {
           end=mid-1;
       }
       else
       {   
           c=mid;
           while(mid>=0 && nums[mid]==target){
               mid--;
           }
           while(c<=end && nums[c]==target)
           {
               c++;
           }
           return new int[] {++mid,--c};
           
       } 
    }
   
      return new int[]{-1,-1};
    }
}