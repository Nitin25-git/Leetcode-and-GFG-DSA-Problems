class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String,Integer> map=new HashMap<>();
  
        for(int i=0;i<words.length;i++)
        {
            map.put(words[i],map.getOrDefault(words[i],0)+1);
        }
        
        PriorityQueue<String> pq=new PriorityQueue<>((a,b) -> map.get(a).equals(map.get(b)) ? b.compareTo(a):map.get(a)-map.get(b));
        
        for(String str:map.keySet())
        {
            pq.offer(str);
            
            if(pq.size()>k)
            {
                pq.poll();
            }
        }
        
        List<String> list=new ArrayList<>();
        while(!pq.isEmpty())
        {
            list.add(0,pq.poll());
        }
        return list;
        
        
    }
    
    
}
