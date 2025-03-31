//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Geeks {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int g = 0; g < t; g++) {
            String[] str = (br.readLine()).trim().split(" ");
            int arr[] = new int[str.length];
            for (int i = 0; i < str.length; i++) {
                arr[i] = Integer.parseInt(str[i]);
            }
            System.out.println(new Solution().missingNumber(arr));
            System.out.println("~");
        }
    }
}
// } Driver Code Ends


// User function Template for Java
class Solution {
    int missingNumber(int nums[]) {
         int n = nums.length + 1; // The full range should be from 1 to n
        long totalSum = (long) n * (n + 1) / 2; // Use long to avoid overflow
        long actualSum = 0;

        for (int num : nums) {
            actualSum += num; // Sum the elements
        }

        return (int) (totalSum - actualSum); // Convert back to int
    }
}