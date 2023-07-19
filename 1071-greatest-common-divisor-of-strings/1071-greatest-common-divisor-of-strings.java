class Solution {
    public String gcdOfStrings(String str1, String str2) {
        int n1=str1.length();
        int n2=str2.length();
        if(!(str1+str2).equals(str2+str1))
            return "";
        return str1.substring(0,gcd(n1,n2));
      
    }
     int gcd(int n1,int n2)
        {   int temp=0;
            for(int i=1;i<=n1 && i<=n2;i++)
            {
                if(n1%i==0 && n2%i==0)
                    temp=i;
            }
            return temp;
        }
        
}