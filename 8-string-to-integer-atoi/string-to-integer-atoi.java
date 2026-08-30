class Solution {
    public int myAtoi(String s) {

        String str = s.strip();

        if (str.length() == 0) {
            return 0;
        }

        int i = 0;
        int sign = 1;

        if (str.charAt(i) == '-') {
            sign = -1;
            i++;
        } else if (str.charAt(i) == '+') {
            i++;
        }

        long num = 0;

        while (i < str.length() &&
               Character.isDigit(str.charAt(i))) {

            int digit = str.charAt(i) - '0';

            num = num * 10 + digit;

            if (sign == 1 && num > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }

            if (sign == -1 && -num < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }

            i++;
        }

        return (int) (sign * num);
    }
}