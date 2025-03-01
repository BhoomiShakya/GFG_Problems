//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine().trim()); // Read number of test cases

        // Loop for each test case
        while (t-- > 0) {
            String line = read.readLine().trim(); // Read the array input
            String[] numsStr = line.split(" ");   // Split the input string by spaces
            int[] nums =
                new int[numsStr.length]; // Convert string array to integer array
            for (int i = 0; i < numsStr.length; i++) {
                nums[i] = Integer.parseInt(numsStr[i]);
            }

            int target = Integer.parseInt(read.readLine().trim()); // Read target sum

            Solution ob = new Solution(); // Create an object of Solution class
            System.out.println(
                ob.perfectSum(nums, target)); // Call perfectSum and print the result
            System.out.println("~");          // Call perfectSum and print the result
        }
    }
}
// } Driver Code Ends


class Solution {
    // Function to calculate the number of subsets with a given sum
    
    public static int solution(int []arr, int t, int i, ArrayList<ArrayList<Integer>>ans , ArrayList<Integer> list, int [][]dp){
        if(i>=arr.length){
            if(t==0){
                // ans.add(new ArrayList<>(list));
                return 1;
            }
            return 0;
        }
        
        if (dp[i][t] != -1) return dp[i][t];

        int l = 0;
        if (arr[i] <= t) {
            l = solution(arr, t - arr[i], i + 1,ans, list,  dp);
        }

        int r = solution(arr, t, i+1, ans, list, dp);
        return dp[i][t]= l+r;
        
    }
    
    public int perfectSum(int[] nums, int target) {
        // code here
        int [][]dp = new int[nums.length+1][target+1];
        for (int[] row : dp) Arrays.fill(row, -1);

        ArrayList<ArrayList<Integer>>ans = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        // solution(nums, target, 0, ans , list);
        // return ans.size();
        return solution(nums, target, 0, ans , list, dp);
    }
}