class Solution {
    public int addDigits(int num) {
        int r=0;
        int sum=0;
        if(num>=0 && num<=9)
            return num;
        while(num>0)
        {
            r=num%10;
            sum=sum+r;
            num=num/10;
            
        }
        int n1;
        while(sum>=10)
        {
            n1=sum;
            sum=0;

            while(n1>0)
            {
             r=n1%10;
            sum=sum+r;
            n1=n1/10;
            }
            
        }
        
        return sum;
    }
}