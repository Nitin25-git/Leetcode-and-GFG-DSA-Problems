class Solution {
    public int findPairs(int[] nums, int k) {
        HashMap<Integer,Integer> map =new HashMap<>();
        int count=0;
        for(int i=0;i<nums.length;i++)
        {
            if(map.containsKey(nums[i]))
            {
                map.put(nums[i],map.get(nums[i])+1);
            }
            else
            {
                map.put(nums[i],1);
            }
        }
        for(int i:map.keySet())
        {
            if((k==0 && map.get(i)>1) ||(map.containsKey(i+k) && k!=0))
               count++;
                
        }
        return count;
        
    }
}