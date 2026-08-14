class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int low = 1;
        int high = 0;
        int ans = 0;

        for(int weight : weights){
            low = Math.max(low,weight);
        }
        for(int weight : weights ){
            high += weight;
        }

        while(low <=high){
            int mid = low + (high-low)/2;
            int currentLoad  = 0;
            int day = 1;

            for(int weight : weights){
                if(currentLoad + weight <= mid){
                    currentLoad += weight;
                }else{
                    day++;
                    currentLoad = weight;
                }
            }
            if(day <= days){
                ans = mid;
                high = mid -1;
            }else{
                low = mid+1;
            }
            
        }
        return ans;
    }
}