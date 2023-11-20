class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        
        HashMap<Integer,Integer> map=new HashMap<>();
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<nums1.length;i++)
        {
            map.put(nums1[i],map.getOrDefault(nums1[i],0)+1);
        }
        for(int i:nums2)
        {
            if(map.containsKey(i) && map.get(i)>0)
            {
                list.add(i);
                map.put(i,map.get(i)-1);
            }
        }
        int arr[]=new int[list.size()];
        int c=0;
        for(int i:list)
        {
            arr[c]=i;
            c++;
        }
        return arr;
        
    }
}