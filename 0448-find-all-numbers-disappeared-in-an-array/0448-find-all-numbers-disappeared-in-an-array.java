class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list =new ArrayList<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            map.put(nums[i],i);
        }
        for(int i=1;i<=nums.length;i++)
        {
            if(map.containsKey(i))
               continue;
             else
               list.add(i);
        }
               return list;
    }
}