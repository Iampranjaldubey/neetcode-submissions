class Solution:
    def minCostClimbingStairs(self, cost: List[int]) -> int:

        n = len(cost)

        dp = [-1] * n

        def solve(i):

            if i == 0:
                return cost[0]

            if i == 1:
                return cost[1]

            if dp[i] != -1:
                return dp[i]

            dp[i] = cost[i] + min(
                solve(i - 1),
                solve(i - 2)
            )

            return dp[i]

        return min(solve(n - 1), solve(n - 2))   