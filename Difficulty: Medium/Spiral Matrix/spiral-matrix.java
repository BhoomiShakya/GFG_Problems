// User function Template for Java

class Solution {

    public int findK(int a[][], int n, int m, int k) {
        // Your code goes here
        int row=a.length;
        int col=a[0].length;
        ArrayList<Integer> list = new ArrayList<>();
        int left =0;
        int right=col-1;
        int top=0;
        int bottom =row-1;
        
        while (top <= bottom && left <= right) {
        //right side
        for(int i=left; i<=right ;i++){
            list.add(a[top][i]);
            
        }
        top++;
        
        //bottom side
        for(int i=top; i<=bottom;i++){
            list.add(a[i][right]);
            
        }
        right--;
        //left side
        for(int i=right; i>=left;i--){
            list.add(a[bottom][i]);
            
        }
        
        bottom--;
        //top side
        for(int i=bottom ; i>=top;i--){
            list.add(a[i][left]);
           
        }
         left++;
        }
        
        return list.get(k-1);
    }
}