//{ Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            String S = br.readLine().trim();
            Solution obj = new Solution();
            ArrayList<String> ans = obj.findPermutation(S);
            Collections.sort(ans);
            for (int i = 0; i < ans.size(); i++) {
                out.print(ans.get(i) + " ");
            }
            out.println();

            out.println("~");
        }
        out.close();
    }
}

// } Driver Code Ends


class Solution {
    public static void solution(String s, HashSet<String> ans, StringBuilder current, boolean[] freq) {
        if (current.length() == s.length()) {
            ans.add(current.toString());
            return;
        }

        for (int i = 0; i < s.length(); i++) {
            if (!freq[i]) {
                freq[i] = true;
                current.append(s.charAt(i));

                solution(s, ans, current, freq);

                current.deleteCharAt(current.length() - 1);
                freq[i] = false;
            }
        }
    }

    public ArrayList<String> findPermutation(String s) {
        // Code here
         HashSet<String> ans = new HashSet<>();
        boolean[] freq = new boolean[s.length()];
        solution(s, ans, new StringBuilder(), freq);
        ArrayList<String> solu= new ArrayList<>(ans);
        // System.out.println(solu);
        return solu;
    }
    
}