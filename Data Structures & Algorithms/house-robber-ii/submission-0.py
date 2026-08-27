class Solution:
    def rob(self, nums: List[int]) -> int:
        n = len(nums)

        if n == 1:
            return nums[0]

        def solve(start, end):
            dp = {}

            def dfs(i):
                # Base case
                if i < start:
                    return 0

                # Memoization
                if i in dp:
                    return dp[i]

                # Choices
                rob_current = nums[i] + dfs(i - 2)
                skip_current = dfs(i - 1)

                dp[i] = max(rob_current, skip_current)

                return dp[i]

            return dfs(end)

        # Case 1: exclude last house
        case1 = solve(0, n - 2)

        # Case 2: exclude first house
        case2 = solve(1, n - 1)

        return max(case1, case2)