//{ Driver Code Starts
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // Number of test cases
        sc.nextLine();        // Consume the newline character

        while (t-- > 0) {
            String input = sc.nextLine();

            // Replace ][ with ],[
            input = input.replace("][", "],[");

            ArrayList<ArrayList<Integer>> mat = new ArrayList<>();
            String[] rows = input.split("],\\s*\\[");

            for (String row : rows) {
                row = row.replaceAll("[\\[\\]]", ""); // Remove any surrounding brackets
                ArrayList<Integer> intRow = new ArrayList<>();
                for (String num : row.split(",")) {
                    intRow.add(Integer.parseInt(num.trim()));
                }
                mat.add(intRow);
            }

            Solution obj = new Solution();
            ArrayList<String> result = obj.findPath(mat);

            if (result.isEmpty()) {
                System.out.println("[]");
            } else {
                for (String res : result) {
                    System.out.print(res + " ");
                }
                System.out.println();
            }
            System.out.println("~");
        }
        sc.close();
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
     public static void solution(int i, int j, ArrayList<ArrayList<Integer>> mat, ArrayList<String> list, 
                                String ans, ArrayList<ArrayList<Integer>> visi, int n, int m) {
        // Base case: If we reached the bottom-right corner, store the path
        if (i == n - 1 && j == m - 1) {
            list.add(ans);
            return;
        }

       

       

        

        // Move down
        if (i + 1 < n && visi.get(i + 1).get(j) == 0 && mat.get(i + 1).get(j) == 1) {
            visi.get(i + 1).set(j, 1);
            solution(i + 1, j, mat, list, ans + "D", visi, n, m);
            visi.get(i + 1).set(j, 0);
        }
        
         // Move left
        if (j - 1 >= 0 && visi.get(i).get(j - 1) == 0 && mat.get(i).get(j - 1) == 1) {
            visi.get(i).set(j - 1, 1);
            solution(i, j - 1, mat, list, ans + "L", visi, n, m);
            visi.get(i).set(j - 1, 0);
        }
        
         // Move right
        if (j + 1 < m && visi.get(i).get(j + 1) == 0 && mat.get(i).get(j + 1) == 1) {
            visi.get(i).set(j + 1, 1);
            solution(i, j + 1, mat, list, ans + "R", visi, n, m);
            visi.get(i).set(j + 1, 0);
        }
        
        // Move up
        if (i - 1 >= 0 && visi.get(i - 1).get(j) == 0 && mat.get(i - 1).get(j) == 1) {
            visi.get(i - 1).set(j, 1);
            solution(i - 1, j, mat, list, ans + "U", visi, n, m);
            visi.get(i - 1).set(j, 0);
        }
    }
    // Function to find all possible paths
    public ArrayList<String> findPath(ArrayList<ArrayList<Integer>> mat) {
        // code here
        int n = mat.size();
        int m = mat.get(0).size();
        
        ArrayList<String> list = new ArrayList<>();
        
        ArrayList<ArrayList<Integer>> visi = new ArrayList<>();
         // Initialize the visited matrix with 0s
        for (int i = 0; i < n; i++) {
            ArrayList<Integer> row = new ArrayList<>(Collections.nCopies(m, 0));
            visi.add(row);
        }
                visi.get(0).set(0, 1);

        solution(0, 0, mat, list, "", visi, n, m);
        return list;
    }
}