class Solution {
    public boolean areIsomorphic(String s1, String s2) {
        // code here
        Map<Character, Character> mp = new HashMap<>();
        for(int i=0;i<s1.length();i++){
            char ss= s1.charAt(i);
            char tt= s2.charAt(i);
            if(( mp.containsKey(ss) && !mp.get(ss).equals(tt)) || 
            (!mp.containsKey(ss) && mp.containsValue(tt))) return false;
            mp.put(ss,tt);
        }
        return true;
    }
}