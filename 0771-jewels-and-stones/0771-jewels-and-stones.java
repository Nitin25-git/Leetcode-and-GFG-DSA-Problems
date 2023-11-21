class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        HashMap<Character,Integer> map=new HashMap<>();
        int count=0;
        for(int i=0;i<stones.length();i++)
        {
            map.put(stones.charAt(i),map.getOrDefault(stones.charAt(i),0)+1);
        }
        
        for(int i=0;i<jewels.length();i++)
        {
            if(map.containsKey(jewels.charAt(i)))
            {
                count+=map.get(jewels.charAt(i));
                map.put(jewels.charAt(i),0);
                
            }
            
        }
        return count;
        
        
    }
}