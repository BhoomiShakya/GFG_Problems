class Solution {
    public static boolean checkPangram(String s) {
        // code here
        // if(s.length() != 26) return false;
         s = s.toLowerCase();   
        int []freq= new int[26];
        // Arrays.fill(freq, 0);
        for(int i=0;i<s.length();i++){
             char c = s.charAt(i);
            if (c >= 'a' && c <= 'z') {
                freq[c - 'a']++;
            }
        }
        
        // boolean check = Arrays.stream(freq).allMatch(ele -> ele>=1);
        // return check;
        for(int ele:freq){
            if(ele==0) return false;
        }
    return true;
        
    }
}