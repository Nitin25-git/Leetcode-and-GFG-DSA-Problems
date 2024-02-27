class Solution {
    public int[] replaceElements(int[] arr) {
        int n=arr.length-1;
        int max=-1;
        for(int i=n;i>=0;i--)
        {
            int current=arr[i];
            arr[i]=max;
            max=Math.max(max,current);
        }
        return arr;
        
    }
}