class Solution {
    int minRow(int mat[][]) {
        // code here
         int min = Integer.MAX_VALUE;
        int ans = -1;

        for (int i = 0; i < mat.length; i++) {  // start from 0
            int cnt = countOnes(mat[i]);
            if (cnt < min) {
                min = cnt;
                ans = i + 1;  // convert 0-based to 1-based index
            }
        }
        return ans;
        
    }
    public static int countOnes(int []arr){
        // int n=arr.length;
        // int idx=-1;
        // for(int i=1;i<arr.length;i++){
        //     if(arr[i]==1){
        //         idx=i;
        //         break;
        //     }
        // }
        // return n-idx;
         int cnt = 0;
        for (int val : arr) {
            if (val == 1) cnt++;
        }
        return cnt;
    }
};