class Solution {
    public List<List<Integer>> subsets(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();
        int n = nums.length;
        int totalSet = 1 << n;
        for (int mask = 0; mask < totalSet; mask++) {
            List<Integer> curr = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                if ((mask & (1 << i)) != 0) {
                    curr.add(nums[i]);
                }
            }
            result.add(curr);
        }
        return result;
    }
}