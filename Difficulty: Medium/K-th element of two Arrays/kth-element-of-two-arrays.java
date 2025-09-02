class Solution {
    public int kthElement(int a[], int b[], int k) {
        // code here
        int n1= a.length;
        int n2= b.length;
        int i=0;
        int j=0;
        int cnt=1;
        int element=-1;
        while(i<n1 && j<n2){
            if(a[i]<b[j]){
                if(cnt==k){
                    element = a[i];
                }
                i++;
                cnt++;
            }
            else{
                if(cnt==k){
                    element = b[j];
                }
                j++;
                cnt++;
            }
        }
        
        while(i<n1){
             if(cnt==k){
                    element = a[i];
                }
                i++;
                cnt++;
        }
        
        while(j<n2){
            if(cnt==k){
                    element = b[j];
                }
                j++;
                cnt++;
        }
        
        return element;
    }
}