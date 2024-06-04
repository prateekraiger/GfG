//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.util.*;

class GfG {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            Solution ob = new Solution();
            System.out.println(ob.binaryNextNumber(s));
        }
    }
}
// } Driver Code Ends




// User function Template for Java
class Solution {
    public String binaryNextNumber(String s) {
        // Find the first non-zero index
        int firstNonZeroIndex = s.indexOf('1');
        if (firstNonZeroIndex == -1) {
            return "1";
        }
        s = s.substring(firstNonZeroIndex);

        boolean foundZero = false;
        StringBuilder sb = new StringBuilder(s);
        for (int i = sb.length() - 1; i >= 0; i--) {
            if (sb.charAt(i) == '0') {
                sb.setCharAt(i, '1');
                foundZero = true;
                for (int j = i + 1; j < sb.length(); j++) {
                    sb.setCharAt(j, '0');
                }
                break;
            }
        }
        if (!foundZero) {
            StringBuilder temp = new StringBuilder("1");
            for (int i = 0; i < sb.length(); i++) {
                temp.append('0');
            }
            return temp.toString();
        }
        return sb.toString();
    }
}