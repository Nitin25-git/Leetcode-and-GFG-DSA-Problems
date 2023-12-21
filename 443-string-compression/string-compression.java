class Solution {
    public int compress(char[] chars) {
        if (chars.length <= 1) {
            return chars.length;
        }

        StringBuilder str = new StringBuilder();
        int i = 0;
        while (i < chars.length) {
            char currentChar = chars[i];
            int count = 0;
            while (i < chars.length && chars[i] == currentChar) {
                count++;
                i++;
            }
            str.append(currentChar);
            if (count > 1) {
                str.append(count);
            }
        }

        for (int k = 0; k < str.length(); k++) {
            chars[k] = str.charAt(k);
        }

        return str.length();
    }
}
