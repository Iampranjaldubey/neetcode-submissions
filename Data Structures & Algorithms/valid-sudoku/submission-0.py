class Solution:
    def isValidSudoku(self, board: List[List[str]]) -> bool:
        # checking rows
        for i in range (9):
            seen=set()
            for j in range (9):
                if board[i][j]==".":
                    continue
                if board[i][j] in seen:
                    return False
                else:
                    seen.add(board[i][j])
        # checking columns 
        for i in range (9):
            seen=set()
            for j in range (9):
                if board[j][i]==".":
                    continue
                if board[j][i] in seen:
                    return False
                else:
                    seen.add(board[j][i])
        # checking box
        for sq in range (9):
            seen=set()
            for i in range (3):
                for j in range (3):
                    r = (sq//3)*3+i
                    c = (sq%3)*3+j
                    if board[r][c]==".":
                        continue
                    if board[r][c] in seen:
                        return False
                    else:
                        seen.add(board[r][c])
        return True





        
        