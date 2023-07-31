class Solution {
    public int majorityElement(int[] nums) {
        int me=0;
        int count=0;
        for(int i:nums)
        {
            if(count==0)
                me=i;
            if(i==me){
                count++;
                
            }
            else
                count--;
        }
        return me;
        
    }
}