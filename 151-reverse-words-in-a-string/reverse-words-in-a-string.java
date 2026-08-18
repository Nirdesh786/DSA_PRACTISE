class Solution {
    public String reverseWords(String s) {
        String[] str = s.trim().split("\\s+");
        String[] rev = new String[str.length];
        int index = str.length-1;
        for(int i=0;i<str.length;i++){
            rev[index--] = str[i];
        }
        String ans = String.join(" ",rev);
        return ans;
    }
}