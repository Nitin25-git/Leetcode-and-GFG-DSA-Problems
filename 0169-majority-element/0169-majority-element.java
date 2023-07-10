import java.util.*;
class Solution {
    public int majorityElement(int[] nums) {
       		 HashMap<Integer,Integer> map=new HashMap<>();
         for(int i=0;i<nums.length;i++)
         {
             if(map.containsKey(nums[i]))
             {
                 int of=map.get(nums[i]);
                 int nf=of+1;
                 map.put(nums[i],nf);
             }
             else{
                 map.put(nums[i],1);
             }
         }
        int a=nums[0];
        int maxcount=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            if(maxcount<map.get(nums[i]))
            {
                maxcount=map.get(nums[i]);
                a=nums[i];
            }
        }
        return a;
        
    }
}