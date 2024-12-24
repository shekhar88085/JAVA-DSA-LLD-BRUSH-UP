package LLD.TicTacToe;

public class Player {
    private String name;
    private char symbol;

    // Constructor
    public Player(String name, char symbol) {
        if (symbol != 'X' && symbol != 'O') {
            throw new IllegalArgumentException("Symbol must be 'X' or 'O'");
        }
        this.name = name;
        this.symbol = symbol;
    }

    // Getters
    public String getName() {
        return name;
    }

    public char getSymbol() {
        return symbol;
    }

    // Overridden toString() for better readability
    @Override
    public String toString() {
        return "Player{name='" + name + "', symbol=" + symbol + "}";
    }
}
