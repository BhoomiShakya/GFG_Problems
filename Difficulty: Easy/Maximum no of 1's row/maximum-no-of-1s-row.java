// User function Template for Java

class Sol {
    public static int maxOnes(int arr[][], int N, int M) {
        // your code here
        int max=Integer.MIN_VALUE;
        int idx =-1;
        for(int i=0;i<arr.length;i++){
            int cnt=solution(arr[i]);
            if(cnt>max){
                max=cnt;
                idx=i;
            }
        }
        return idx;
    }
    
    public static int solution(int []arr){
        int low=0;
        int high= arr.length-1;
        int idx=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]>=1){
                idx=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return (idx == -1) ? 0 : arr.length - idx;

    }
}   