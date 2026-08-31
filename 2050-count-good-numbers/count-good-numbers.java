class Solution {

    private static final long MOD = 1000000007L;

    public int countGoodNumbers(long n) {

        long evenPosition = (n + 1) / 2;
        long oddPosition = n / 2;

        long sum = (power(5, evenPosition) * power(4, oddPosition)) % MOD;

        return (int) sum;
    }

    private long power(long base, long expo) {

        if (expo == 0) {
            return 1;
        }

        long half = power(base, expo / 2);

        long result = (half * half) % MOD;

        if (expo % 2 == 1) {
            result = (result * base) % MOD;
        }

        return result;
    }
}