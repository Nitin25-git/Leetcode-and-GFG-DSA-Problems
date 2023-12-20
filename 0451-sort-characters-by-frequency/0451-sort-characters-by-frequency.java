class Solution {
    public String frequencySort(String s) {
        
HashMap<Character,Integer> map=new HashMap<>();
        
        for(Character ch:s.toCharArray())
        {
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        StringBuilder str=new StringBuilder();
        PriorityQueue<Character> pq=new PriorityQueue<>((a, b) -> map.get(b) - map.get(a));
        
            for(Character ch :map.keySet())
            {
                pq.add(ch);
            }
            
            while(!pq.isEmpty())
            {
                char ch=pq.remove();
                int freq=map.get(ch);
                
                for(int i=0;i<freq;i++)
                {
                    str.append(ch);
                }
            }
        
        
        return str.toString();
        
        
    }
}