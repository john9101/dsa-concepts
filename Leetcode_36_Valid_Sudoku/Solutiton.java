class Solution {
    public boolean isValidSudoku(char[][] board) {
        // 1. Check all rows
        // Iterate through each row (0 -> 8)
        for(int row = 0; row < 9; row++){
            Set<Character> seen = new HashSet<>();
            for(int col = 0; col < 9; col++){
                if(board[row][col] == '.') continue;
                if(seen.contains(board[row][col])) return false;
                seen.add(board[row][col]);
            }
        }

        // 2. Check all columns
        // Iterate through each column (0 -> 8)
        for(int col = 0; col < 9; col++){
            Set<Character> seen = new HashSet<>();
            for(int row = 0; row < 9; row++){
                if(board[row][col] == '.') continue;
                if(seen.contains(board[row][col])) return false;
                seen.add(board[row][col]);
            }
        }

        // 3. Check all 3x3 sub-boxes
        // There are 9 sub-boxes in total, indexed from 0 -> 8
        for(int square = 0; square < 9; square++){
            Set<Character> seen = new HashSet<>();
            for(int row = 0; row < 3; row++){
                for(int col = 0; col < 3; col++){

                    // 4. Calculate the actual row and column index on the board
                    // (square / 3) * 3 → gives the starting row of the box
                    // (square % 3) * 3 → gives the starting column of the box
                    int qRow = (square / 3) * 3 + row;
                    int qCol = (square % 3) * 3 + col;
                    if(board[qRow][qCol] == '.') continue;
                    if(seen.contains(board[qRow][qCol])) return false;
                    seen.add(board[qRow][qCol]);
                }
            }
        }

        return true;
    }
}