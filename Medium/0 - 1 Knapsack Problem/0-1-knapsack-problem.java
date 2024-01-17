//{ Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

class gfg
{
    public static void main(String args[])throws IOException
    {
        //reading input using BufferedReader class
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        
        //reading total testcases
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0)
        {
            //reading number of elements and weight
            int n = Integer.parseInt(read.readLine());
            int w = Integer.parseInt(read.readLine());
            
            int val[] = new int[n];
            int wt[] = new int[n];
            
            String st[] = read.readLine().trim().split("\\s+");
            
            //inserting the values
            for(int i = 0; i < n; i++)
              val[i] = Integer.parseInt(st[i]);
             
            String s[] = read.readLine().trim().split("\\s+"); 
            
            //inserting the weigths
            for(int i = 0; i < n; i++)
              wt[i] = Integer.parseInt(s[i]);
              
            //calling method knapSack() of class Knapsack
            System.out.println(new Solution().knapSack(w, wt, val, n));
        }
    }
}




// } Driver Code Ends




class Solution 
{ 
    //Function to return max value that can be put in knapsack of capacity W.
    static int knapSack(int W, int wt[], int val[], int n) 
    { 
         // your code here 
         int [][]dp= new int[W+1][wt.length+1];
         for(int []arr: dp){
             Arrays.fill(arr,-1);
         }
         return solution(W,wt,val,0,dp);
    } 
    public static int solution(int w, int wt[], int val[], int i , int[][]dp){
        if(w==0 || i==wt.length){
            return 0;
        }
        if(dp[w][i] != -1){
            return dp[w][i];
        }
        int inc=0;
        int exc=0;
        if(w>=wt[i]){
            inc=val[i]+solution(w-wt[i],wt,val,i+1,dp);
        }
        exc=solution(w,wt,val,i+1,dp);
        return dp[w][i]=Math.max(inc, exc);
    }
}


