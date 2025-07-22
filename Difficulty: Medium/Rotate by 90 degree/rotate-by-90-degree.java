// User function Template for Java

class GFG {
    static void rotate(int mat[][]) {
        // Code Here
        for(int i=0;i<mat.length;i++){
            for(int j=i+1;j<mat[0].length;j++){
                int temp= mat[i][j];
                mat[i][j]= mat[j][i];
                mat[j][i]= temp;
            }
        }
        
        for(int i=0;i<mat.length;i++){
            rotateRow(mat[i]);
        }
        
    }
    
    public static void rotateRow(int []arr){
        int i=0;
        int j=arr.length-1;
        while(i<=j){
            int t=arr[i];
            arr[i]=arr[j];
            arr[j]=t;
            i++;
            j--;
        }
    }
}