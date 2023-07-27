class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int currcount=0;
        int maxcount=0;
        if(nums==null)
            return 0;
        for(int i:nums)
        {
            if(i==1){
                
                currcount+=1;
                if(currcount>maxcount)
                {
                    maxcount=currcount;
                }
                
            }
            else
            {
                currcount=0;
            }
            
        }
        return maxcount;
        
    }
}