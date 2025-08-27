// User function Template for Java

class Solution {
    static int leastWeightCapacity(int[] arr, int n, int d) {
        // code here
        int low= maxElement(arr);
        int high = sumElement(arr);
        
        while(low<=high){
            int mid=(low+high)/2;
            int dayReq = checkDays(arr, mid, d);
            if(dayReq<=d){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return low;
    }
    
    public static int checkDays(int []arr, int cap, int day){
        int load=0;
        int d=1;
        for(int i=0;i<arr.length;i++){
            if((load+arr[i])<=cap){
                load+=arr[i];
            }
            else{
                d++;
                load=arr[i];
            }
        }
        return d;
        
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