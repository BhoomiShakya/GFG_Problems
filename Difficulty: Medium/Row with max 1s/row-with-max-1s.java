// User function Template for Java

class Solution {
    public int rowWithMax1s(int arr[][]) {
        // code here
        int max=Integer.MIN_VALUE;
        int idx=-1;
        for(int i=0;i<arr.length;i++){
            int cnt=check(arr[i]);
            if(cnt>max){
                max=cnt;
                idx=i;
            }
        }
        return (max == 0) ? -1 : idx; // if all rows have 0 ones, return -1
        
    }
    public static int check(int []arr){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
return sum;     }
}