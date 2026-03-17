class Solution {
    public boolean isPalindrome(int x) {
        if(x<0) return false;
        int reverse = 0;
        int result = x;
        while(x!=0){
            int num = x%10;
            reverse = reverse * 10 + num;
            x = x/10;
        }
        if(result==reverse){
            return true;
        }
        return false;
    }
}