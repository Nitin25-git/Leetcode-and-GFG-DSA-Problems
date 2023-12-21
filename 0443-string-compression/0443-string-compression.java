class Solution {
    public int compress(char[] chars) {
        if(chars.length <= 1)
            return chars.length;
        
        int i = 0;
        int j = 1;
        int count = 1;
        StringBuilder str = new StringBuilder();
        
        while(i < chars.length - 1 && j < chars.length) {
            count = 1;
            while(j < chars.length && chars[i] == chars[j]) {
                count++;
                j++;
            }
            
            str.append(chars[i]);
            
            if(count > 1) {
                str.append(count);
            }
            
            i = j;
            if(j < chars.length) {
                j = i + 1;
            }
        }
        
        if(i == chars.length - 1) {
            str.append(chars[i]);
        }
        
        for(int k = 0; k < str.length(); k++) {
            chars[k] = str.charAt(k);
        }
        
        return str.length();
    }
}
