class Solution {
    public static int maxDepth(String s) {
        // code here
        Stack<Character> stk = new Stack<>();
        int cnt=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                stk.push(s.charAt(i));
            }
            else if(s.charAt(i)==')'){
                stk.pop();
            }
            cnt= Math.max(cnt,(int)stk.size());
        }
        return cnt;
    }
}
