//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while (t-- > 0) {
            String str = in.readLine();
            Solution ob = new Solution();
            System.out.println(ob.palindromicPartition(str));
        }
    }
}
// } Driver Code Ends


// User function Template for Java
// import java.util.*;

class Solution {

    public static int solution(int idx, String s, ArrayList<ArrayList<String>> ans, ArrayList<String> list, int[] dp) {
        int cnt = Integer.MAX_VALUE;

        if (idx >= s.length()) {
            return 0;
        }

        if (dp[idx] != -1) {
            return dp[idx];
        }

        for (int i = idx; i < s.length(); i++) {
            if (isPalindrome(s, idx, i)) {
                list.add(s.substring(idx, i + 1));
                cnt = Math.min(cnt, 1 + solution(i + 1, s, ans, list, dp)); // ✅ Fixed call
                list.remove(list.size() - 1);
            }
        }

        return dp[idx] = cnt;
    }

    public static boolean isPalindrome(String s, int i, int j) {
        while (i <= j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    static int palindromicPartition(String s) {
        int[] dp = new int[s.length() + 1];
        Arrays.fill(dp, -1);
        ArrayList<ArrayList<String>> ans = new ArrayList<>();
        ArrayList<String> list = new ArrayList<>();
        return solution(0, s, ans, list, dp)-1;
    }
}
