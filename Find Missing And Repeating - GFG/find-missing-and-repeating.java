//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            String[] str = br.readLine().split(" ");

            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(str[i]);
            }

            int[] ans = new Solve().findTwoElement(a, n);
            System.out.println(ans[0] + " " + ans[1]);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solve {
    int[] findTwoElement(int arr[], int n) {
        int array[]=new int[2];
        int xor=0;
        for(int i=0;i<n;i++)
        {
            xor=xor^arr[i];
        }
        for(int i=1;i<=n;i++)
        {
            xor=xor^i;
        }
        int rmb=xor & -xor;
        int x=0;
        int y=0;
        for(int i:arr)
        {
            if((i & rmb)==0)
            {
                x=x^i;
            }
            else
            {
                y=y^i;
            }
        }
        for(int i=1;i<=n;i++)
        {
            if((i & rmb)==0)
            {
                x=x^i;
            }
            else
            {
                y=y^i;
            }
        }
         for(int i:arr)
         {
             if(i==x)
             {
                 array[0]=x;
                 array[1]=y;
             }
             else if(i==y)
             {
                 array[0]=y;
                 array[1]=x;
             }
         }
        return array;
    }
}