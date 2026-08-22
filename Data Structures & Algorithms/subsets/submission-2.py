class Solution:
    def subsets(self, nums: List[int]) -> List[List[int]]:
        result = []
        subset = []

        def backtrack(index):
            # Base case
            if index == len(nums):
                result.append(subset.copy())
                return

            # Choice 1: Don't include nums[index]
            backtrack(index + 1)

            # Choice 2: Include nums[index]
            subset.append(nums[index])
            backtrack(index + 1)

            # Backtrack
            subset.pop()

        backtrack(0)
        return result