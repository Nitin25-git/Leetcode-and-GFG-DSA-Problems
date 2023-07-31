class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            if(map.containsKey(nums[i]))
            {
                int of=map.get(nums[i]);
                int nf=i;
                if(Math.abs(nf-of)<=k)
                    return true;
                else
                    map.put(nums[i],i);
                    
                
            }
            else
            {
                map.put(nums[i],i);
            }
            
            
            
            
        }
        return false;
        
    }
}