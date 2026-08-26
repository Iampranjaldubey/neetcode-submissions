class Solution:
    def rob(self, nums: List[int]) -> int:
        n= len(nums)
        dp=[-1]*n
        def solve(i):
            if i < 0:
                return 0
            if dp[i]!=-1:
                return dp[i]
            dp[i]= max(
                nums[i] + solve(i - 2),  # rob
                solve(i - 1)             # skip
            )
            return dp[i]
        return solve(n-1) 