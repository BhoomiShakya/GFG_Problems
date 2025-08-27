class Solution {
    int smallestDivisor(int[] arr, int k) {
        // Code here
        int low=1;
        int high=maxElement(arr);
        while(low<=high){
            int mid = (low+high)/2;
            int num=findDivisor(arr, mid);
            if(num<=k){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return low;
    }
    
    public static int findDivisor(int []arr, int mid){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=(int)(Math.ceil((double)arr[i]/(double)mid));
        }
        return sum;
    }
    
     public static int maxElement(int []arr){
        int maxi=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            maxi=Math.max(maxi, arr[i]);
        }
        return maxi;
    }
}