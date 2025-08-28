class Solution {
    public int splitArray(int[] arr, int k) {
        // code here
         if(k>arr.length) return -1;
        int low=maxElement(arr);
        int high=sumElement(arr);
        while(low<=high){
            int mid=(low+high)/2;
            int num=possible(arr, mid, k);
            if(num <=k){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return low;
    }
     public static int possible(int []arr, int mid, int k){
        int pages=0;
        int cnt=1;
        for(int i=0;i<arr.length;i++){
            if((pages+arr[i])<=mid){
                pages+=arr[i];
            }
            else{
                cnt++;
                pages=arr[i];
            }
        }
        return cnt;
    }

    public static int maxElement(int []arr){
        int maxi=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            maxi=Math.max(maxi, arr[i]);
        }
        return maxi;
    }

    public static int sumElement(int []arr){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        return sum;
    }
};