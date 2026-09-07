class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        generate(0,candidates,target,new ArrayList<>(),ans);
        return ans;
    }
    private void generate(int index,int[] nums, int target,List<Integer>current,List<List<Integer>>ans){
        if(target==0 ){
            ans.add(new ArrayList<>(current));
            return;
        }
        if(index==nums.length || target<0){
            return;
        }
        current.add(nums[index]);
        generate(index,nums,target-nums[index],current,ans);
        current.remove(current.size()-1);

        generate(index+1,nums,target,current,ans);

    }
}