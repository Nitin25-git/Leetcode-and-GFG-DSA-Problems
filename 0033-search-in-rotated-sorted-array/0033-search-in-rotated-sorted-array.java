class Solution {
    public int search(int[] nums, int target)
     {
         int index=0;
         int a=0;int b=0;
         int n=nums.length;
          int last2=nums.length-1;
         for(int i=0;i<n-1;i++)
     {
         if(nums[i]>nums[i+1])
         {
            index=i+1;
            b=index;
         }
     }
     int last1=index-1;
      while(a<=last1)
      {
          int mid=(a+last1)/2;
          if(nums[mid]>target)
            last1=mid-1;
           else if(nums[mid]<target)
             a=mid+1;
            else
              return mid; 
      }

            while(b<=last2)
      {
          int mid=(b+last2)/2;
          if(nums[mid]>target)
            last2=mid-1;
           else if(nums[mid]<target)
             b=mid+1;
            else
              return mid; 
      }
       return -1;
    }
}