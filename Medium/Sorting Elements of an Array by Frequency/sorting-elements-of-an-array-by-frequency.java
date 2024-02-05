//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;
import java.util.Map.Entry;


class Driverclass 
{
	public static void main(String[] args) throws NumberFormatException, IOException
	{
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(sc.readLine());
	    while(n != 0)
		{
			int size = Integer.parseInt(sc.readLine());
			int arr[] = new int[size];
			String[] temp = sc.readLine().trim().split("\\s+");
			
			for(int i = 0; i < size; i++)
			    arr[i] = Integer.parseInt(temp[i]);
			    
			 ArrayList<Integer> ans = new ArrayList<Integer>();
			 ans = new Solution().sortByFreq(arr, size);
			 for(int i=0;i<ans.size();i++)
			    System.out.print(ans.get(i)+" ");
		    System.out.println();
			n--;
		}
	}
}


// } Driver Code Ends
//User function Template for Java
class Solution
{
    //Function to sort the array according to frequency of elements.
    static class Pair{
        int ke;
        int val;
        Pair (int ke, int val){
            this.ke = ke;
            this.val=val;
        }
    }
    static ArrayList<Integer> sortByFreq(int arr[], int n)
    {
        // add your code here
        HashMap<Integer, Integer> mp = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(mp.containsKey(arr[i])){
                mp.put(arr[i], mp.get(arr[i])+1);
            }
            else{
                mp.put(arr[i],1);
            }
        }
        ArrayList<Pair> list= new ArrayList<>();
        for(Map.Entry<Integer, Integer> entry: mp.entrySet()){
            list.add(new Pair(entry.getKey(), entry.getValue()));
        }
        Collections.sort(list, (a,b)-> a.val==b.val?a.ke-b.ke:b.val-a.val);
        ArrayList<Integer> ans= new ArrayList<>();
        int idx=0;
        for(Pair pair:list){
            int x=pair.ke;
            int freq=pair.val;
            for(int i=0;i<freq;i++){
                ans.add(x);
            }
        }
        return ans;
    }
}