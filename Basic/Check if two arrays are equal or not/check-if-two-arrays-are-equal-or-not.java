//{ Driver Code Starts
//Initial Template for Java


/*package whatever //do not write package name here */

import java.io.*;

import java.util.*;
class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		
		long t=sc.nextLong();
		
		while(t-->0)
		{
		  int n=sc.nextInt();
		  long arr[]=new long[n];
		  long brr[]=new long[n];
		  
		  for(int i=0;i<n;i++)
		  {
		      arr[i]=sc.nextLong();
		  }
		  
		  for(int i=0;i<n;i++)
		  {
		      brr[i]=sc.nextLong();
		  }
		  Solution ob = new Solution();
		  System.out.println(ob.check(arr,brr,n)==true?"1":"0");
		  
		  
		}
	}
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    public static boolean check(long A[], long B[], int N) {
        HashMap<Long, Integer> frequencyMap = new HashMap<>();

        for (int i = 0; i < N; i++) {
            frequencyMap.put(A[i], frequencyMap.getOrDefault(A[i], 0) + 1);
        }

        for (int i = 0; i < N; i++) {
            if (!frequencyMap.containsKey(B[i]) || frequencyMap.get(B[i]) == 0) {
                return false;
            }
            frequencyMap.put(B[i], frequencyMap.get(B[i]) - 1);
        }

        for (int freq : frequencyMap.values()) {
            if (freq != 0) {
                return false;
            }
        }

        return true;
    }
}
