class Solution {
    public String largestGoodInteger(String num) {
        
        char maxchar='\u0000';
        for(int i=2;i<num.length();i++)
        {
            if(num.charAt(i)==num.charAt(i-1) && num.charAt(i)==num.charAt(i-2))
            {
                maxchar=(char)(Math.max(maxchar,num.charAt(i)));
            }
        }
        
        return maxchar=='\u0000'?"":new String(new char[]{maxchar,maxchar,maxchar});
        
    }
}