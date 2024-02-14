class Solution {
    public int numberOfGoodPartitions(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int M = 1000000007;

        int n=nums.length;
        for(int i=0;i<n;i++)
        {
            map.put(nums[i],i);
        }
        int i=0;
        int j=Math.max(0,map.get(nums[0]));
        int result=1;
        while(i<n)
        {
            if(i>j)
            {
               result=(int)((result*2)%M); 
            }
            j=Math.max(j,map.get(nums[i]));
            i++;
                
        }
        return result;
    }
}