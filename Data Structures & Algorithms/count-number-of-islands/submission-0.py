class Solution:
    def numIslands(self, grid: List[List[str]]) -> int:
        rows=len(grid)
        cols=len(grid[0])
        direction=[[1, 0], [-1, 0], [0, 1], [0, -1]]
        visited=[[False]*cols for _ in range(rows)]
        count=0
        for r in range (rows):
            for c in range (cols):
                if grid[r][c]=="1" and not visited[r][c]:
                    count+=1
                    stack=[(r,c)]
                    visited[r][c]=True
                    while stack:
                        r,c=stack.pop()
                        for dr,dc in direction:
                            nr=dr+r
                            nc=dc+c
                            if 0<=nr<rows and 0<=nc<cols and grid[nr][nc]=="1" and not visited[nr][nc]:
                                visited[nr][nc]=True
                                stack.append((nr,nc))
        return count


            