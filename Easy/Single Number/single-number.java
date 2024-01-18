//{ Driver Code Starts
//Initial Template for Java


import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            int n = Integer.parseInt(br.readLine().trim());
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            int ans = new Solution().getSingle(arr, n);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


//User function Template for Java



class Solution {
    int getSingle(int arr[], int n) {
        // code here
        // HashMap<Integer, Integer> mp= new HashMap<>();
        // for(int i=0;i<arr.length;i++){
        //     if(mp.containsKey(arr[i])){
        //         mp.put(arr[i], mp.get(arr[i])+1);
        //     }
        //     else{
        //         mp.put(arr[i],1);
        //     }
        // }
        // int ans=-1;
        // for(Map.Entry<Integer, Integer> entry: mp.entrySet()){
        //     if(entry.getValue()%2 != 0){
        //         ans=entry.getKey();
        //     }
        // }
        
        // return ans;
        int ans=0;
        for(int i=0;i<arr.length;i++){
            ans=ans^arr[i];
        }
        return ans;
    }
}