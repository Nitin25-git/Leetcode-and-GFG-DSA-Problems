class Solution {
    public int nextGreaterElement(int n) {
        char nums[]=(n+"").toCharArray();
        int i;
        for( i=nums.length-1;i>0;i--)
        {
            if(nums[i-1]<nums[i])
                break;
        }
        if(i==0)
            return -1;
        
        int swap=nums[i-1];
        int smallest=i;
        for(int j=i+1;j<nums.length;j++)
        {
            if(swap<nums[j] && nums[j]<nums[smallest])
            {
                smallest=j;
            }
        }
        char temp=nums[i-1];
        nums[i-1]=nums[smallest];
        nums[smallest]=temp;
        
        Arrays.sort(nums,i,nums.length);
        
        long ans=Long.parseLong(new String(nums));
        if(ans>Integer.MAX_VALUE)
            return -1;
        return (int)ans;
        
    }
}