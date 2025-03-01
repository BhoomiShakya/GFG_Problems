//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {

            String input_line[] = read.readLine().trim().split("\\s+");
            int N = input_line.length;
            int arr[] = new int[N];
            for (int i = 0; i < N; i++) arr[i] = Integer.parseInt(input_line[i]);
            int sum = Integer.parseInt(read.readLine());

            Solution ob = new Solution();
            if (ob.isSubsetSum(arr, sum))
                System.out.println("true");
            else
                System.out.println("false");

            System.out.println("~");
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    
    public static boolean solution(int[] arr,  int i, int t,    Boolean [][]dp){
        if(t==0) return true;
        
        if(i>=arr.length) return false;
        
        if (dp[i][t] != null) return dp[i][t];  // Return cached result
        
        boolean ex= solution(arr, i+1, t, dp);
        boolean in = false;
        if(arr[i]<=t){
            in= solution(arr, i+1, t-arr[i], dp);
        }
        
        return dp[i][t]= in || ex;

    }

    static Boolean isSubsetSum(int arr[], int target) {
       int n = arr.length;
       Boolean[][] dp = new Boolean[n][target + 1];

        // for (int[] row : dp) Arrays.fill(row, -1);

        return(solution(arr, 0, target, dp));
        // return true;
        
    }
}