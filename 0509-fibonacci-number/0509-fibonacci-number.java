class Solution {
    public int fib(int n) {
        
        int arr[]=new int[31];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=-1;
        }
        return solve(n,arr);
    }
    
    public int solve(int n,int arr[])
    {
        if(n<=1)
            return n;
        
        if(arr[n]!=-1)
            return arr[n];
        
        arr[n]=solve(n-1,arr)+solve((n-2),arr);
        return arr[n];
    }
}