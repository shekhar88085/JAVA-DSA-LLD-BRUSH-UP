package LLD.DesignPatterns.Behavioral.ChainOfResponsibility;

public class AuthenticationHandler implements Handler {
    private Handler nextHandler;

    @Override
    public void handleRequest(OrderRequest request) {
        if (request.isAuthenticated()) {
            System.out.println("User authenticated.");
            if (nextHandler != null) {
                nextHandler.handleRequest(request);
            }
        } else {
            System.out.println("Authentication failed.");
        }
    }

    @Override
    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }
}
