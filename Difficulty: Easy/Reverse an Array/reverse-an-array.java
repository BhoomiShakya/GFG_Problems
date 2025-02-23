//{ Driver Code Starts
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());

        while (tc-- > 0) {
            String str[] = br.readLine().split(" ");
            int arr[] = new int[str.length];

            for (int i = 0; i < str.length; i++) arr[i] = Integer.parseInt(str[i]);
            Solution obj = new Solution();

            obj.reverseArray(arr);
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            System.out.println("~");
        }
    }
}
// } Driver Code Ends


class Solution {
    public static void solution(int []arr, int i) {
        if(i>=arr.length/2){
            return;
        }
        
        swap(i, (arr.length-1-i), arr);
        solution(arr, i+1);
        
    }
    
    public static void swap(int i, int j, int []arr){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    
    public void reverseArray(int arr[]) {
        // code here
        solution(arr,0);
        // for(int i=0;i<arr.length;i++){
        //     System.out.print("")
        // }
    }
}