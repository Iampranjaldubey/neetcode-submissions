class Solution:
    def coinChange(self, coins: List[int], amount: int) -> int:
        # memoization
        dp={}
        def solve(amount):
            if amount==0:
                return 0
            if amount<0:
                return float('inf')
            if amount in dp:
                return dp[amount]
            result = float('inf') 
            for coin in coins:
                result=min(result,1+solve(amount-coin))
            dp[amount]=result
            return dp[amount]
        
        answer = solve(amount)

        if answer == float('inf'):
            return -1

        return answer