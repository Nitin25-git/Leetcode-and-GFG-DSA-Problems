class Solution {
    public boolean isLongPressedName(String name, String typed) {
        int i=0,j=0;
       int n1=name.length();
        int n2=typed.length();
         if(n1>n2)
             return false;
      
            if(name.charAt(0)!=typed.charAt(0))
                return false;
        
        while(i<n1 && j<n2)
        {
            if(name.charAt(i)==typed.charAt(j))
            {
                i++;
                j++;
            }
            else 
            {
                if(typed.charAt(j-1)==typed.charAt(j))
                {
                    j++;
                }
                else
                    return false;
            }
        }
        while(j<n2)
        {   
            if(typed.charAt(j)!=typed.charAt(j-1))
                return false;
            j++;
        }
        while(i<n1)
        {
            return false;
        }
        return true;
    }
}