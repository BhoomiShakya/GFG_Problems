// User function Template for Java

class Solution {
    public int findMin(int[] arr) {
        // complete the function here
        int low=0;
        int high=arr.length-1;
        int ans= Integer.MAX_VALUE;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[low]<=arr[mid]){
                ans=Math.min(ans, arr[low]);
                low=mid+1;
            }
            else{
                ans=Math.min(ans, arr[mid]);
                high=mid-1;
            }
        }
        return ans;
    }
}
