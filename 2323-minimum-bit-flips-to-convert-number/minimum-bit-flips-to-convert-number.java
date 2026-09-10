class Solution {
    public int minBitFlips(int start, int goal) {
        int xor =( start ^ goal );
        int count = 0;
        String str = Integer.toBinaryString(xor);
        for(char c : str.toCharArray()){
            if(c=='1'){
                count++;
            }
        }
        return count;
    }
}