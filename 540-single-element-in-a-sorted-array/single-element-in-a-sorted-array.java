class Solution {
    public int singleNonDuplicate(int[] nums) {
        HashMap <Integer,Integer> map = new HashMap<>();
        int value = 0;
        for(int num : nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(Map.Entry <Integer,Integer> entry : map.entrySet()){
            if(entry.getValue()==1){
                value =  entry.getKey();
            }
        }
        return value;
    }
}