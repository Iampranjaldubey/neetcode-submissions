class Solution:
    def lengthOfLIS(self, nums: List[int]) -> int:
        # top down-II

        n = len(nums)
        dp=[-1]*n

        def solve(i):
            if dp[i]!=-1:
                return dp[i]
            LIS=1
            for j in range(i+1,n):
                if nums[i]<nums[j]:
                    LIS=max(LIS,1+solve(j))
            dp[i]=LIS
            return LIS
        return max(solve(i) for i in range(n))