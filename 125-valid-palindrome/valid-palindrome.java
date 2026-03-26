import java.util.Scanner;

class Solution {
    public boolean isPalindrome(String s) {
        
String result = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
int start = 0;
        int end = result.length() - 1;
        while (start < end) {
            if (result.charAt(start) != result.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     String s = sc.nextLine();
    //     Solution obj = new Solution();
    //     System.out.println(obj.isPalindrome(s));
    // }
}
