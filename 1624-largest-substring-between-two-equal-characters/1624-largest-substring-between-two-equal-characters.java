class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        int max=-1;
        int n=s.length();
        HashMap<Character,Integer> map=new HashMap<>();
        
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(!map.containsKey(ch))
                map.put(ch,i);
            else
            {
                max=Math.max(max,i-map.get(ch)-1);
            }
        }
        
        return max;
        
    }
}