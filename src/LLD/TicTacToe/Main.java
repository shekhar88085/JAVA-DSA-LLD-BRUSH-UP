package LLD.TicTacToe;

public class Main {
    public static void main(String[] args) {
        // Initialize the board
        Board board = new Board();
        
        // Create players
        Player eeshanee = new Player("Eeshanee", 'X');
        Player chitraksh = new Player("Chitraksh", 'O');
        
        // Display the initial board
        board.displayBoard();

        Game game = new Game(eeshanee, chitraksh);
        game.playGame();
    }
}
