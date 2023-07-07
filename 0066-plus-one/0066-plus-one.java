class Solution {
    public int[] plusOne(int[] digits) {
        int n=digits.length-1;
        for(int i=n;i>=0;i--)
        {
            if(digits[i]<9)
            {
               digits[i]++;
                return digits;
            }
            digits[i]=0;
        }
        digits=new int[digits.length+1];
        digits[0]=1;
        return digits;
        
    }
}