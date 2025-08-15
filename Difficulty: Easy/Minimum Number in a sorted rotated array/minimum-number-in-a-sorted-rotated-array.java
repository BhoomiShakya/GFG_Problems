class Solution {
    // Function to find the minimum element in sorted and rotated array.
    static int minNumber(int arr[], int low, int high) {
        // Your code here
        int ans=Integer.MAX_VALUE;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[low]<=arr[mid]){
                ans= Math.min(ans, arr[low]);
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