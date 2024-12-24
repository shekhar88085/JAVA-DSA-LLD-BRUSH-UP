package LLD.TicTacToe;

public class Board {
    char[][] grid = new char[3][3];
    int totalFilled = 0;

    void displayBoard() {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                System.out.print(grid[i][j] == '\0' ? " " : grid[i][j]);
                if (j != 2) {
                    System.out.print(" | ");
                }
            }
            System.out.println();
            if (i != 2) {
                System.out.println("---+---+---");
            }
        }
    }

    boolean isFull() {
        return totalFilled == 9;
    }

    boolean placeMark(int row, int col, char symbol) {
        if (grid[row][col] == '\0') { // Check if the cell is empty
            grid[row][col] = symbol;
            totalFilled++;
            return true;
        }
        return false; // Invalid move
    }

    boolean checkWin() {
        // Check rows
        for (int i = 0; i < 3; i++) {
            if (grid[i][0] != '\0' && grid[i][0] == grid[i][1] && grid[i][1] == grid[i][2]) {
                return true;
            }
        }

        // Check columns
        for (int i = 0; i < 3; i++) {
            if (grid[0][i] != '\0' && grid[0][i] == grid[1][i] && grid[1][i] == grid[2][i]) {
                return true;
            }
        }

        // Check primary diagonal
        if (grid[0][0] != '\0' && grid[0][0] == grid[1][1] && grid[1][1] == grid[2][2]) {
            return true;
        }

        // Check secondary diagonal
        if (grid[0][2] != '\0' && grid[0][2] == grid[1][1] && grid[1][1] == grid[2][0]) {
            return true;
        }

        return false; // No winner
    }

    void reset() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                grid[i][j] = '\0';
            }
        }
        totalFilled = 0;
    }
}
