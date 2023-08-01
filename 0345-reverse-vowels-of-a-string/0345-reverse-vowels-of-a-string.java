class Solution {
    public String reverseVowels(String s) {
        char[] array = s.toCharArray();
        int start=0;
        int end=array.length-1;
        char temp;
        while(start<end)
        {
            if(checkvowel(array[start]) && checkvowel(array[end]))
            {
                temp=array[start];
                array[start]=array[end];
                array[end]=temp;
                start++;
                end--;
                
            }
              if(!checkvowel(array[start])  && start<end)
             {
                 start++;
             }
             if(!checkvowel(array[end]) && start<end)
                end--;
        }
        
       return new String(array);
        
    }
     
        boolean checkvowel(char ch)
        {
            
            if(ch=='a' || ch=='e' || ch=='i' || ch=='u'|| ch=='o'||ch=='A' || ch=='E' || ch=='I' || ch=='O'|| ch=='U')
                return true;
            return false;
        }
}