//{ Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;


class GFG {
	public static void main (String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int testcases = Integer.parseInt(br.readLine());
		
		while(testcases-- > 0){
		    
		    int n = Integer.parseInt(br.readLine());
		    int arr[] = new int[n];
		    
		    
		    String line = br.readLine();
		    String[] elements = line.trim().split(" ");
		    
		    for(int index = 0;index < n; index++){
		        arr[index] = Integer.parseInt(elements[index]);
		    }
		    
		    Solution obj = new Solution();
		    ArrayList<Integer> v;
		    v = obj.countFreq(arr,n);
            for(int i : v)
                System.out.print(i+" ");
		    System.out.println();
		}
		
	}
}


// } Driver Code Ends


//User function Template for Java

class Solution{
    
    public ArrayList<Integer> countFreq(int[] a, int n)  
    { 
  
        ArrayList<Integer> list=new ArrayList<>();
        Arrays.sort(a);
        int count=1;
        for(int  i=0;i<a.length-1;i++)
        {
            if(a[i]==a[i+1])
            {
                count+=1;
            }
            else 
            {
                
                list.add(count);
                count=1;
            }
        }
        list.add(count);
        for(int i=1;i<list.size();i++)
        {
            list.set(i,list.get(i-1)+list.get(i));
        }
        
        return list;
        
    }  
      
}

