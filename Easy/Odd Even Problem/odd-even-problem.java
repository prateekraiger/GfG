//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while (t-- > 0) {

            String s;
            s = br.readLine();

            Solution obj = new Solution();
            String res = obj.oddEven(s);

            System.out.println(res);
        }
    }
}

// } Driver Code Ends


class Solution {
    public static String oddEven(String s) {
        int[] freq = new int[26];
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }

        int x = 0, y = 0;
        for (int i = 0; i < 26; i++) {
            if (freq[i] > 0) {
                if ((i + 1) % 2 == 0 && freq[i] % 2 == 0) {
                    x++;
                }
                if ((i + 1) % 2 != 0 && freq[i] % 2 != 0) {
                    y++;
                }
            }
        }

        return (x + y) % 2 == 0 ? "EVEN" : "ODD";
    }
}
