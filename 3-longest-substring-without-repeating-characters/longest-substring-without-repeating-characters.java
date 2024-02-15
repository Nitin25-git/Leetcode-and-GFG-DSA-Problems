class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 1)
            return 1;

        HashMap<Character, Integer> map = new HashMap<>();
        int start = 0;
        int length = 0;

        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);

            if (map.containsKey(currentChar)) {
                start = Math.max(map.get(currentChar) + 1,start);
            }

            map.put(currentChar, i);
            length = Math.max(length, i - start + 1);
        }

        return length;
    }
}
