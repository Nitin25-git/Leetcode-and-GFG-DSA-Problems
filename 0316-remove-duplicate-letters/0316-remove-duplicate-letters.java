
// class Solution {
//     public String removeDuplicateLetters(String s) {
//         HashMap<Character, Integer> map = new HashMap<>();
//         StringBuilder str = new StringBuilder();

//         // Count the occurrences of each character in the string
//         for (char ch : s.toCharArray()) {
//             map.put(ch, map.getOrDefault(ch, 0) + 1);
//         }

//         // Append unique characters to StringBuilder
//         for (char ch : map.keySet()) {
//             if (map.get(ch) == 1) {
//                 // Append to StringBuilder only if the character occurs once
//                 str.append(ch);
//             }
//         }

//         return str.toString();
//     }
// }



class Solution {
    public String removeDuplicateLetters(String s) {
        HashMap<Character, Integer> lastOccurrence = new HashMap<>();
        HashSet<Character> seen = new HashSet<>();
        StringBuilder result = new StringBuilder();

        // Populate the last occurrence map
        for (int i = 0; i < s.length(); i++) {
            lastOccurrence.put(s.charAt(i), i);
        }

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (!seen.contains(ch)) {
                // Append character to the result while it's smaller and there are more occurrences later
                while (result.length() > 0
                        && ch < result.charAt(result.length() - 1)
                        && i < lastOccurrence.get(result.charAt(result.length() - 1))) {
                    seen.remove(result.charAt(result.length() - 1));
                    result.deleteCharAt(result.length() - 1);
                }

                seen.add(ch);
                result.append(ch);
            }
        }

        return result.toString();
    }
}

