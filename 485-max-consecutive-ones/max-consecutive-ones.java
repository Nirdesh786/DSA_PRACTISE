class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxLength = 0;
        int value = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                value++;
                if(maxLength<value){
                    maxLength = value;
                }
            }else{
                value = 0;
            }
        }
        return maxLength;
    }
}