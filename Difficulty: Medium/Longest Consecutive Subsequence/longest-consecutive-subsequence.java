//{ Driver Code Starts
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            // Read first array
            String input = br.readLine();
            String[] inputArray = input.split(" ");
            int[] arr = Arrays.stream(inputArray).mapToInt(Integer::parseInt).toArray();

            Solution ob = new Solution();
            int res = ob.longestConsecutive(arr);

            System.out.println(res);
            System.out.println("~");
        }
    }
}

// } Driver Code Ends


class Solution {

    // Function to return length of longest subsequence of consecutive integers.
    public int longestConsecutive(int[] arr) {
        // code here
        int longest=1;
        int cnt=0;
        
        for(int i=0;i<arr.length;i++){
            int x=arr[i];
            cnt =1;
            while(linearSeach(arr, x+1)==true){
                x=x+1;
                cnt++;
            }
            longest=Math.max(longest, cnt);
        }
        return longest;
    }
    
    public static boolean linearSeach(int []arr, int x){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                return true;
            }
        }
        return false;
    }
}