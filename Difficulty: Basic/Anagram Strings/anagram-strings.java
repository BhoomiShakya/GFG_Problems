// User function template for Java
class Solution {
    static int areAnagram(String s1, String s2) {
        // code here
        if(s1.length() != s2.length()){
            return 0;
        }
        int []freq= new int[128];
        Arrays.fill(freq, 0);
        
        for(int i=0;i<s1.length();i++){
            
            freq[s1.charAt(i)-'a']++;
        }
        
        for(int i=0;i<s2.length();i++){
            
            freq[s2.charAt(i)-'a']--;
        }
        
        boolean check = Arrays.stream(freq).allMatch(ele->ele==0);
        
        if(check){
            return 1;
        }
        return 0;
        
    }
}