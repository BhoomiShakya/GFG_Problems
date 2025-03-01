//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Geeks {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine()); // Number of test cases
        for (int g = 0; g < t; g++) {
            String[] str =
                (br.readLine()).trim().split(" "); // Reading input as a string array
            int arr[] = new int[str.length]; // Creating integer array from the input
            for (int i = 0; i < str.length; i++) {
                arr[i] = Integer.parseInt(str[i]);
            }

            // Getting the result from the Solution class
            ArrayList<Integer> result = new Solution().subsetSums(arr);
            Collections.sort(result);
            // Printing the result in space-separated format
            for (int i = 0; i < result.size(); i++) {
                if (i != 0) System.out.print(" ");
                System.out.print(result.get(i));
            }
            System.out.println();    // Print new line after each test case
            System.out.println("~"); // Print new line after each test case
        }
    }
}

// } Driver Code Ends


// User function Template for Java//User function Template for Java
class Solution {
    
    public static void solution(int []arr, int i, int sum, ArrayList<ArrayList<Integer>> ans, ArrayList<Integer> list){
        if(i>=arr.length){
            ans.add(new ArrayList<>(list));
            return;
        }
        list.add(arr[i]);
        solution(arr, i+1, sum+arr[i], ans , list);
        list.remove(list.size()-1);
        solution(arr, i+1, sum, ans, list);
    }
    
    public ArrayList<Integer> subsetSums(int[] arr) {
        // code here
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> sol = new ArrayList<>();
        solution(arr, 0, 0, ans, list);
        for(ArrayList<Integer> vals:ans){
            int sum=0;
            for(int val:vals){
                sum+=val;
            }
            sol.add(sum);
        }
        // System.out.print(sol);
        return sol;
        
    }
}