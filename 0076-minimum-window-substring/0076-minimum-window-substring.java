class Solution {
    public String minWindow(String s, String t) {
        
        int n = s.length();
        HashMap<Character, Integer> map = new HashMap<>();
        
        for (char ch : t.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        
        int count = t.length();
        int i = 0, j = 0;
        int minStart = 0;
        int minWindow = Integer.MAX_VALUE;
        
        while (j < n) {
            char currentJ = s.charAt(j);
            if (map.containsKey(currentJ) && map.get(currentJ) > 0) {
                count--;
            }
            if (map.containsKey(currentJ)) {
                map.put(currentJ, map.get(currentJ) - 1);
            }
            
            while (count == 0) {
                if (minWindow > j - i + 1) {
                    minWindow = j - i + 1;
                    minStart = i;
                }
                
                char currentI = s.charAt(i);
                if (map.containsKey(currentI)) {
                    map.put(currentI, map.get(currentI) + 1);
                    if (map.get(currentI) > 0) {
                        count++;
                    }
                }
                i++;
            }
            j++;
        }
        
        return minWindow == Integer.MAX_VALUE ? "" : s.substring(minStart, minStart + minWindow);
    }
}
