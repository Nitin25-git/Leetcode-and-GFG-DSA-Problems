class Solution {
    public boolean validMountainArray(int[] arr) {
   int i=1;

if(arr.length<3)
 return false;
        while(i<arr.length && arr[i-1]<arr[i])
        {
            i++;
        }
        if(i==1 || i==arr.length)
         return false;

         while(i<arr.length && arr[i]<arr[i-1])
         {
             i++;
         }

         return i==arr.length;
        
    }
}