class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<stones.length;i++)
        {
            pq.add(stones[i]);
        }
        
        while(pq.size()>1)
        {
            int top1=pq.poll();
            int top2=pq.poll();
            if(top1>top2)
            {
                pq.add(top1-top2);
            }
        }
        return pq.isEmpty()?0:pq.poll();
        
    }
}