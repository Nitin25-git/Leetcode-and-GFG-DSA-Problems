class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:nums)
        {
            map.put(i,map.getOrDefault(i,0)+1);
            
        }
        
         PriorityQueue<Integer> pq=new PriorityQueue<>((a, b) -> map.get(a) - map.get(b));

        for(int i:map.keySet())
        {
            pq.offer(i);
            
            
            if(pq.size()>k)
            {
                pq.poll();
            }
                
        }
        
        int [] result=new int[k];
        int index=0;
        while(!pq.isEmpty())
        {
            result[index++]=pq.poll();
        }
        
        return result;
        
        
        
    }
}






// import java.util.*;

// class Solution {

//     public int[] topKFrequent(int[] nums, int k) {
//         // Min-heap
//         PriorityQueue<List<Integer>> pq = new PriorityQueue<>((a, b) -> a.get(1) - b.get(1));

//         // Count frequency of each element
//         // Worst Case - n distinct elements are stored, so, space O(n)
//         Map<Integer, Integer> map = new HashMap<>();
//         for (int i : nums) {
//             map.put(i, map.getOrDefault(i, 0) + 1);
//         }

//         // Push in min-heap and maintain size k
//         for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
//             List<Integer> pair = new ArrayList<>();
//             pair.add(entry.getKey());
//             pair.add(entry.getValue());

//             pq.offer(pair);

//             if (pq.size() > k) {
//                 pq.poll();
//             }
//         }

//         // Pick all top K elements
//         int[] result = new int[k];
//         int index = 0;
//         while (!pq.isEmpty()) {
//             result[index++] = Objects.requireNonNull(pq.poll()).get(0);
//         }
//         return result;
//     }
// }
