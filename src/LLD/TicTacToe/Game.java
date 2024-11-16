package LLD.TicTacToe;

import java.util.Scanner;

public class Game {
    private Player p1;
    private Player p2;
    private Player currentPlayer;
    private Board board;

    public Game(Player p1, Player p2) {
        this.p1 = p1;
        this.p2 = p2;
        this.currentPlayer = p1; // Default to Player 1
        this.board = new Board();
    }

    void switchPlayer() {
        currentPlayer = (currentPlayer == p1) ? p2 : p1;
    }

    void playGame() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Starting Tic Tac Toe!");
        board.displayBoard();

        while (!board.isFull()) {
            System.out.println(currentPlayer.getName() + "'s turn (" + currentPlayer.getSymbol() + ")");
            System.out.print("Enter row (0-2): ");
            int row = scanner.nextInt();
            System.out.print("Enter column (0-2): ");
            int col = scanner.nextInt();

            // Validate input and place mark
            if (row >= 0 && row < 3 && col >= 0 && col < 3 && board.placeMark(row, col, currentPlayer.getSymbol())) {
                board.displayBoard();
                if (board.checkWin()) {
                    System.out.println(currentPlayer.getName() + " wins!");
                    return;
                }
                switchPlayer();
            } else {
                System.out.println("Invalid move. Try again.");
            }
        }

        System.out.println("It's a draw!");
    }
}
