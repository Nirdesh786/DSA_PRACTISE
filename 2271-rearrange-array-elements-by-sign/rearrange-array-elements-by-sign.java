class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] arrNeg  = new int[nums.length/2];
        int[] arrPos = new int[nums.length/2];

        int index1 = 0;
        int index2 = 0;
        for(int num : nums){
            if(num>0){
                arrPos[index1++] = num;
            }else{
                arrNeg[index2++]= num;
            }
        }
        index1 = 0;
        for(int i=0;i<nums.length;i=i+2){
            nums[i]=arrPos[index1++];
        }
         index2 = 0;
        for(int i=1;i<nums.length;i=i+2){
            nums[i]=arrNeg[index2++];
        }
        return nums;
    }
}