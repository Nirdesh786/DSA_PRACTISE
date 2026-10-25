class Solution {
    public String intToRoman(int num) {
        int[] val = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] sym = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        StringBuilder ans = new StringBuilder();
        for (int idx = 0; idx < val.length; idx++) {
        while (num >= val[idx]) {
        ans.append(sym[idx]);
        num -= val[idx];
        }
        }
        return ans.toString();
        
    }
}