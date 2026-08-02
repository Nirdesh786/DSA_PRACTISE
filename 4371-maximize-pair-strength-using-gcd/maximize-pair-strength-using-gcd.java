class Solution {
    public long maxPairStrength(int[] nums) {

        long maxStrength = 0;

        for (int i = 0; i < nums.length - 1; i++) {

            for (int j = i + 1; j < nums.length; j++) {

                long g = gcd(nums[i], nums[j]);

                long strength = ((long) nums[i] * nums[j]) / (g * g);

                maxStrength = Math.max(maxStrength, strength);
            }
        }

        return maxStrength;
    }

    public static long gcd(long a, long b) {

        while (b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }

        return a;
    }
}