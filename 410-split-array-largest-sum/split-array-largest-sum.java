class Solution {
    public int splitArray(int[] nums, int k) {
        int low = 0;
        int high = 0;
        int ans = 0;
        for(int num : nums){
            low = Math.max(num,low);
            high += num;
        }

        while(low <= high){
            int mid = low + (high-low)/2;
            int sum =0;
            int count= 1;
            
            for(int num: nums){
                if(sum+num>mid){
                    count++;
                    sum = num;
                }else{
                    sum+=num;
                }
            }
            if(count<=k){
                ans = mid;
                high = mid -1;
            }else{
                low = mid+1;
            }
        }
        return ans;
    }
}