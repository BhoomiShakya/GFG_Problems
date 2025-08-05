class Solution {
    public int searchInsertK(int arr[], int k) {
        // code here
       int low=0;
       int high=arr.length-1;
       int ans=arr.length;
       while(low<=high){
           int mid= (low+high)/2;
           if(arr[mid]>=k){
               ans=mid;
               high=mid-1;
           }
           else{
               low=mid+1;
           }
       }
       return ans;
    }
};