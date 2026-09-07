class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        generate(0,nums,new ArrayList<>(),ans);
        return ans;
    }
    private void generate(int index,int[] nums,List<Integer> current,List<List<Integer>> ans ){
        if(index >= nums.length){
            ans.add(new ArrayList<>(current));
            return;
        }
        current.add(nums[index]);
        generate(index+1,nums,current,ans);
        current.remove(current.size()-1);

        int i=index+1;
        while(i< nums.length && nums[i]==nums[index]){
            i++;
        }
        generate(i,nums,current,ans);

    }
}