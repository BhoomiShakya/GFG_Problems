class Solution {
    public int kokoEat(int[] arr, int k) {
        // code here
        int low=1;
        int high=maxi(arr);
        int mini=Integer.MAX_VALUE;
        while(low<=high){
            int mid=(low+high)/2;
            int timereq = sepTime(arr, mid);
            if(timereq<=k){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return low;
        
    }
    
    public static int sepTime(int []arr, int t){
        int time=0;
        for(int i=0;i<arr.length;i++){
            time= time + (int) Math.ceil((double) arr[i] / (double) t);
        }
        return time;
        
    }
    
    public static int maxi(int []arr){
        int maxx=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            maxx=Math.max(maxx, arr[i]);
        }
        return maxx;
    }
}
