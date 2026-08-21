class Solution {
    public int maxDepth(String s) {
        int ans =0;
        int depth = 0;
        char[] arr = s.toCharArray();
        for(char ch : arr){
            if(ch =='('){
                depth++;
                ans = Math.max(depth , ans);
            }else if(ch==')'){
                depth--;
            }
        }
        return ans;
    }
}