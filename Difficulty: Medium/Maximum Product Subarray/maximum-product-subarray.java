class Solution {
    int maxProduct(int[] arr) {
        // code here
        int max=Integer.MIN_VALUE;
        int pre= 1;
        int suff=1;
        for(int i=0;i<arr.length;i++){
            if(pre==0)pre=1;
            if(suff==0) suff=1;
            pre=pre*arr[i];
            suff=suff*arr[arr.length-1-i];
            max=Math.max(max, Math.max(pre,suff));
            
        }
        return max;
    }
}