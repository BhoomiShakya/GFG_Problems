class Solution {
    public int cntSubarrays(int[] arr, int k) {
        // code here
        HashMap<Integer, Integer> mp= new HashMap<>();
        mp.put(0,1);
        int prefixSum=0;
        int cnt=0;
        for(int i=0;i<arr.length;i++){
            prefixSum+=arr[i];
            int remove= prefixSum-k;
            
            cnt+=mp.getOrDefault(remove, 0);
            
            mp.put(prefixSum, mp.getOrDefault(prefixSum, 0)+1);
            
        }
        return cnt;
    }
}