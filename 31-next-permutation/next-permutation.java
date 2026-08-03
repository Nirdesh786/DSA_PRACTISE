class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int index = -1;
        for(int i=n-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                index = i;
                break;
            }
        }
        if(index==-1){
           reverse(nums,0,n-1);
           return;
        }
        for(int i =n-1;i>index;i--){
            if(nums[i]>nums[index]){
                swap(nums,i,index);
                break;
            }
        }
        reverse(nums,index+1,n-1);
    }
    public static void swap(int[]nums,int a ,int b){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
    public static void reverse(int[] nums,int num1 , int num2){
        while(num1<num2){
            int temp = nums[num1];
            nums[num1] = nums[num2];
            nums[num2] = temp;
            num1++;
            num2--;
        }
    }
}