class Solution {
    public boolean search(int[] arr, int key) {
        // code here
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid=(high+low)/2;
            if(arr[mid]==key){
                return true;
            }
            if(arr[low] == arr[mid] && arr[mid]==arr[high]){
                low++;
                high--;
                continue;
            }
            
            if(arr[low]<=arr[mid]){
                if(arr[low]<=key && key<=arr[mid]){
                    high=mid-1;
                }
                else{
                    low=mid+1;
                }
            }
            else{
                if(arr[mid]<= key && key<=arr[high]){
                    low=mid+1;
                    
                }
                else{
                    high=mid-1;
                }
            }
        }
        return false;
    }
}
