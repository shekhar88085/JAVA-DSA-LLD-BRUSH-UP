package LLD.DesignPatterns.Behavioral.ChainOfResponsibility;

public class OrderHandler implements Handler {
    private Handler nextHandler;

    @Override
    public void handleRequest(OrderRequest request) {
        System.out.println("Creating order for user: " + request.getUsername());
    }

    @Override
    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }
}