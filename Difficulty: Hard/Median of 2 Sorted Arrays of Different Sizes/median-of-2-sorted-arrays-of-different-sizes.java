class Solution {
    public double medianOf2(int a[], int b[]) {
        // Code Here
         int n1 = a.length;
        int n2 = b.length;

        int n = n1 + n2; //total size
        //required indices:
        int idx2 = n / 2;
        int idx1 = idx2 - 1;
        int cnt = 0;
        int ele1 = -1, ele2 = -1;
        
          //apply the merge step:
        int i = 0, j = 0;
        while(i < n1 && j<n2){
            if(a[i]<b[j]){
                  if(cnt==idx1) ele1 = a[i];
                  if(cnt==idx2) ele2 = a[i];
                  i++;
                  cnt++;
            }
            else{
                if(cnt==idx1) ele1 = b[j];
                  if(cnt==idx2) ele2 = b[j];
                  j++;
                  cnt++;
            }
        }
        while(i<n1){
            if(cnt==idx1) ele1 = a[i];
                  if(cnt==idx2) ele2 = a[i];
                  i++;
                  cnt++;
        }
         
        while(j<n2){
            if(cnt==idx1) ele1 = b[j];
                  if(cnt==idx2) ele2 = b[j];
                  j++;
                  cnt++;
        }
        
        if (n % 2 == 1) {
            return (double)ele2;
        }

        return (double)((double)(ele1 + ele2)) / 2.0;
    }
}