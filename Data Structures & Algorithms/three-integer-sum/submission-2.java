class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();
        int n = nums.length;

        Arrays.sort(nums);

        for (int low = 0; low < n - 2; low++) {

            // handeling duplicates
            if (low > 0 && nums[low] == nums[low - 1]) continue;

            int mid = low + 1;
            int high = n - 1;

            while (mid < high) {
                int sum = nums[low] + nums[mid] + nums[high];

                if (sum == 0) {
                    List<Integer> temp = new ArrayList<>();
                    temp.add(nums[low]);
                    temp.add(nums[mid]);
                    temp.add(nums[high]);
                    result.add(temp);

                    // skip duplicates
                    while (mid < high && nums[mid] == nums[mid + 1]){
                         mid++;
                        }
                    while (mid < high && nums[high] == nums[high - 1]) {
                        high--;
                        }

                    mid++;
                    high--;
                }
                else if (sum < 0) {
                    mid++;
                }
                else {
                    high--;
                }
            }
        }
        return result;
    }
}
