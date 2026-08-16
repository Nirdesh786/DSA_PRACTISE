class Solution {
    public int findKthPositive(int[] arr, int k) {
        int count = 0;
        int max = 0;
        for(int num:arr){
            max = Math.max(max,num);
        }
        for(int i=1;i<=max+k;i++){
            boolean flag = false;
            for(int j=0;j<arr.length;j++){
                if(i==arr[j]){
                    flag = true;
                    break;
                }
            }
            if(flag == false){
                count++;
            }
            if(count==k){
                return  i;
            }
        }
        return -1;
    }
}