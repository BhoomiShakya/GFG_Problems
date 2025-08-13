// User function Template for Java

class Solution {
    static int Search(int arr[], int t) {
        // code here
        int low=0;
        int high = arr.length-1;
        while(low<=high){
            int mid= (low+high)/2;
            if(arr[mid]==t){
                return mid;
            }
            //left side
            if(arr[low]<=arr[mid]){
                if(arr[low]<=t && t< arr[mid]){
                    high=mid-1;
                }
                else{
                    low=mid+1;
                }
            }
            //right side
            else{
                if(arr[mid]<= t && t<= arr[high]){
                    low=mid+1;
                }
                else{
                    high=mid-1;
                }
                
            }
        }
        return -1;
    }
}
