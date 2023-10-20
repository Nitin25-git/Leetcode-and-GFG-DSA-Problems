class Solution {
    public List<Integer> majorityElement(int[] nums) {
        ArrayList<Integer> arr=new ArrayList<>();
        int count1=0;
        int count2=0;
        int e1=Integer.MIN_VALUE;
        int e2=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            if(count1==0 && e2!=nums[i])
            {
                count1++;
                e1=nums[i];
            }
            else if(count2==0 && nums[i]!=e1)
            {
                count2++;
                e2=nums[i];
            }
            else if(e1==nums[i])
                count1++;
            else if(e2==nums[i])
                count2++;
            else
            {
                count1--;
                count2--;
            }
        }
    int c1=0;
        int c2=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==e1)
                c1++;
            if(nums[i]==e2)
                c2++;
        }
       if(c1 > nums.length/3)
            arr.add(e1);
        if(c2 > nums.length/3)
            arr.add(e2);
        return arr;
    
        
        
    }
}