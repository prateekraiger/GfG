//{ Driver Code Starts
import java.util.*;

class ExtraElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            int[] b = new int[n - 1];
            for (int i = 0; i < n; i++) a[i] = sc.nextInt();
            for (int i = 0; i < n - 1; i++) b[i] = sc.nextInt();
            Solution g = new Solution();
            System.out.println(g.findExtra(n, a, b));
        }
    }
}
// } Driver Code Ends


/*Complete the function below*/
class Solution {
    public int findExtra(int n, int arr1[], int arr2[]) {
        // Initialize start and end for binary search
        int start = 0, end = n - 1;
        
        // Binary search to find the extra element in arr1[]
        while (start <= end) {
            int mid = start + (end - start) / 2;
            
            // If the middle elements are equal, the extra element is in the right half
            if (mid < arr2.length && arr1[mid] == arr2[mid]) {
                start = mid + 1;
            } 
            // If the middle elements are not equal, the extra element is in the left half
            else {
                end = mid - 1;
            }
        }
        
        // Return the index of the extra element in arr1[]
        return start;
    }
}
