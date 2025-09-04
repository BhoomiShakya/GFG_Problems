class Solution {
    public static boolean matSearch(int arr[][], int x) {
        // your code here
        int m= arr[0].length;
        int n=arr.length;
        int row=0;
        int col=m-1;
        while(row<n && col>=0){
            if(arr[row][col]==x){
                return true;
            }
            else if(arr[row][col]<x){
                    row++;
            }
            else{
                col--;
            }
        }
        return false;

    }
}