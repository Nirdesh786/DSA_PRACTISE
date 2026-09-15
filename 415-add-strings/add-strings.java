class Solution {
    public String addStrings(String num1, String num2) {
        char[] arr1 = num1.toCharArray();
        char[] arr2 = num2.toCharArray();

        int carry = 0;
        StringBuilder sb = new StringBuilder();

        int n = arr1.length - 1;
        int m = arr2.length - 1;

        while (n >= 0 || m >= 0 || carry != 0) {

            int digit1 = 0;
            int digit2 = 0;

            if (n >= 0) {
                digit1 = arr1[n] - '0';
                n--;
            }

            if (m >= 0) {
                digit2 = arr2[m] - '0';
                m--;
            }

            int sum = digit1 + digit2 + carry;

            sb.append(sum % 10);
            carry = sum / 10;
        }

        return sb.reverse().toString();
    }
}