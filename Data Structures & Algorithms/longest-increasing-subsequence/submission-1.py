class Solution:
    def lengthOfLIS(self, nums: List[int]) -> int:
        # top down approach
        n=len(nums)
        dp=[[-1]*(n+1)for _ in range(n)]
        def solve(i,j):
            if i==n:
                return 0
            if dp[i][j+1]!=-1:
                return dp[i][j+1]
            
            skip = solve(i+1,j)
            include=0
            if j==-1 or nums[j]<nums[i]:
                include=1+solve(i+1,i)
            
            LIS=max(skip,include)
            dp[i][j+1]=LIS
            return LIS
        
        return solve(0,-1)