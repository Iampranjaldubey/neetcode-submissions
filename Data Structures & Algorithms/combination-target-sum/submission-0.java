class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList <>();
        List<Integer> current = new ArrayList <>();
        backtrack(target,nums,current,result,0);
        return result;

  
    }
    public void backtrack(int target, int[] nums,List<Integer> current,List<List<Integer>> result,int start){
        // int sum=0;
        // for(int num : current){
        //     sum+=num;
        // }
        // if (sum==target) result.add(new ArrayList<>(current));
        if (target == 0) {
            result.add(new ArrayList<>(current));
            return;
        }

        if (target < 0) {
            return;
        }
        for(int i = start; i<nums.length;i++){
            current.add(nums[i]);
            backtrack(target-nums[i],nums,current,result,i);
            current.remove(current.size()-1);
        }
    }
}