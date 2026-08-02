class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        Arrays.sort(nums);
        int index = 0;
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]!=nums[i]){
                nums[index++] = nums[i-1];
            }
        }
        nums[index++] = nums[nums.length - 1];
        int maxlen = 1;
        int count = 1;

        for(int i=1;i<index;i++){
            if(nums[i-1]== nums[i]-1){
                count++;
                if(maxlen < count){
                    maxlen = count;
                }
            }else{
                count = 1;
            }

        }
        return maxlen;
    }
}