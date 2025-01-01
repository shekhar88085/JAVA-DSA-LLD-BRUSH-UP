package LLD.DesignPatterns.Behavioral.ChainOfResponsibility;

public interface Handler {
    void handleRequest(OrderRequest request);
    void setNextHandler(Handler nextHandler);
}
