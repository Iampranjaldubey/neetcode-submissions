class Solution:
    def maxAreaOfIsland(self, grid: List[List[int]]) -> int:
        rows=len(grid)
        cols=len(grid[0])
        directions=[(0,-1),(-1,0),(0,1),(1,0)]
        maxArea=0
        def dfs(r,c): 
            if r<0 or r>=rows or c<0 or c>=cols or grid[r][c]==0:
                return 0
            grid[r][c]=0
            count=1
            for dr,dc in directions:
                count+=dfs(dr+r,dc+c)
                
            return count
        
        for r in range (rows):
            for c in range(cols):
                if grid[r][c]==1:
                    count=dfs(r,c)
                    maxArea=max(count,maxArea)
        return maxArea

                
                    

            
