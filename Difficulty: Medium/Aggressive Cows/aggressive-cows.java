class Solution {
    public int aggressiveCows(int[] arr, int k) {
        // code here
        Arrays.sort(arr);
        int low = 1;
        int high = arr[arr.length-1]-arr[0];
        int ans=Integer.MIN_VALUE;
        while(low<=high){
            int mid=(low+high)/2; //this is the maximum possible distance between cows
            if(possiblePlaces(arr, mid, k)){
                low=mid+1;
                ans=mid;
            }
            else{
                high=mid-1;
            }
        }
        return ans;
    }
    
    public static boolean possiblePlaces(int []arr, int dist, int k){
        int last=arr[0];
        int cntcow=1;
        for(int i=1;i<arr.length;i++){
            if((arr[i]-last)>=dist){
                last=arr[i];
                cntcow++;
            }
            if(cntcow>=k) return true;
        }
        return false;
    }
    
}