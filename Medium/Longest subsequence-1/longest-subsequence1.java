//{ Driver Code Starts
import java.io.*;
import java.util.*;

class IntArray {
    public static int[] input(BufferedReader br, int n) throws IOException {
        String[] s = br.readLine().trim().split(" ");
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = Integer.parseInt(s[i]);

        return a;
    }

    public static void print(int[] a) {
        for (int e : a) System.out.print(e + " ");
        System.out.println();
    }

    public static void print(ArrayList<Integer> a) {
        for (int e : a) System.out.print(e + " ");
        System.out.println();
    }
}

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while (t-- > 0) {

            int n;
            n = Integer.parseInt(br.readLine());

            int[] a = IntArray.input(br, n);

            Solution obj = new Solution();
            int res = obj.longestSubseq(n, a);

            System.out.println(res);
        }
    }
}

// } Driver Code Ends

class Solution {
    public static int longestSubseq(int n, int[] a) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int maxi = 0;
        for(int i=0;i<n;i++){
            int element = a[i];
            int prev = map.getOrDefault(element-1, 0);
            int next = map.getOrDefault(element+1, 0);
            int crr = Math.max(prev, next) + 1;
            map.put(element, crr);
            maxi = Math.max(maxi, crr);
        }
        return maxi;
    }
}