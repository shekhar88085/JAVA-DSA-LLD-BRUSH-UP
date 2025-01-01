package LLD.DesignPatterns.Behavioral.Command;

public interface Command {
    void execute();
    void undo(); // Optional for supporting undo
}