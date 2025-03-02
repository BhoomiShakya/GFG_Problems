//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        int t = Integer.parseInt(sc.next());
        while(t>0)
        {
            int n = Integer.parseInt(sc.next());
            Solution T = new Solution();
            List<String> ans = T.AllParenthesis(n);
            String[] sequences = ans.toArray(new String[0]);
            Arrays.sort(sequences);
            int k = sequences.length;
            for(int i=0;i<k;i++)
            {
                System.out.println(sequences[i]);
            }
            
            t--;
            
        
System.out.println("~");
}
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution {
    
    public static void solution(int n, int open , int close, String ans, List<String> list){
       if(open==n && close==n){
            // System.out.print(ans+" ");
            list.add(ans);
            return;
        }
        if(open<=n){
            solution(n, open+1, close, ans+"(", list);
        }
        if(close<open){
            solution(n, open, close+1, ans+")", list);
        }
        
        
    }
    
    public List<String> AllParenthesis(int n) 
    {
        // Write your code here
        List<String> list= new ArrayList<>();
        solution(n, 0, 0, "", list);
        return list;
    }
}