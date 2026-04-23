class Solution {
    public boolean isPalindrome(String s) {
        if(s.length()==0||s==null) return true;
        String result = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        int start = 0;
        int end = result.length()-1;
        for(int i=start;i<end;i++){
            if(result.charAt(start)==result.charAt(end)){
                start++;
                end--;
            }else{
                return false;
            }
        }
        return true;
    }
}