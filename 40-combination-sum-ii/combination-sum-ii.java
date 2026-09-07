class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);

        List<List<Integer>> ans = new ArrayList<>();

        generate(0, candidates, target, new ArrayList<>(), ans);

        return ans;
    }

    private void generate(int index, int[] nums, int target,
                          List<Integer> current,
                          List<List<Integer>> ans) {

        if (target == 0) {
            ans.add(new ArrayList<>(current));
            return;
        }

        if (index == nums.length || target < 0) {
            return;
        }

        // TAKE
        current.add(nums[index]);

        generate(index + 1, nums, target - nums[index],
                 current, ans);

        current.remove(current.size() - 1);

        // SKIP duplicates
        int i = index + 1;

        while (i < nums.length && nums[i] == nums[index]) {
            i++;
        }

        // SKIP
        generate(i, nums, target, current, ans);
    }
}