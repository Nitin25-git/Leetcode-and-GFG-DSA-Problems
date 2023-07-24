class Solution {
    public int majorityElement(int[] nums) {
        int count=0;
        int me=0;
        
        for(int i:nums)
        {
            if(count==0)
                me=i;
            if(me!=i)
                count--;
            else
                count++;
        }
        return me;
        
    }
}