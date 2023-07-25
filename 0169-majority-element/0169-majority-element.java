class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map =new HashMap<>();
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
        int count=0;
        int index=0;
        for(int i:map.keySet())
        {
            if(count<map.get(i)){
                count=map.get(i);
                index=i;
            }
        }
        return index;
        
    }
}