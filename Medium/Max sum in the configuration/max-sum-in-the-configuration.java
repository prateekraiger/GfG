//{ Driver Code Starts
import java.util.*;

class Maxsum_Among_All_Rotations_Array {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

            System.out.println(new Solution().max_sum(arr, n));

            t--;
        }
    }
}

// } Driver Code Ends


class Solution {
    long max_sum(int a[], int n) {
        long arraySum = 0, currentVal = 0;
        for (int i = 0; i < n; i++) {
            arraySum += a[i];
            currentVal += (long)i * a[i];
        }
        long maxVal = currentVal;
        for (int j = 1; j < n; j++) {
            currentVal = currentVal + arraySum - (long)n * a[n - j];
            if (currentVal > maxVal) {
                maxVal = currentVal;
            }
        }
        return maxVal;
    }
}
