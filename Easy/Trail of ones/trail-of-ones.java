//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());

            Solution ob = new Solution();
            System.out.println(ob.numberOfConsecutiveOnes(N));
        }
    }
}
// } Driver Code Ends


// User function Template for Java
class Solution {
     static int numberOfConsecutiveOnes(int n) {
        int MOD = 1000000007;
        
        int[] dp = new int[n + 1];
        
        dp[0] = 0;
        dp[1] = 0;
        dp[2] = 1;
        
        if (n < 3) {
            return dp[n];
        }
        
        int a = 0;
        int b = 1;
        
        for (int i = 3; i <= n; i++) {
            int c = (a + b) % MOD;            
            dp[i] = (dp[i - 1] * 2) % MOD + c % MOD;
            dp[i] = dp[i] % MOD;            
            a = b;
            b = c;
        }
        return dp[n];
    }
}