class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        // code here
         int n=matrix.length;
        int m=matrix[0].length;
        int low= 0;
        int high= n*m -1;
        while(low<=high){
            int mid=(low+high)/2;
            int r=mid/m;
            int c=mid%m;
            if(matrix[r][c]==target){
                return true;
            }
            if(matrix[r][c]>target){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return false;
    }
}
