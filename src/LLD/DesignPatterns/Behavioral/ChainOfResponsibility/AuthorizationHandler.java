package LLD.DesignPatterns.Behavioral.ChainOfResponsibility;

public class AuthorizationHandler implements Handler {
    private Handler nextHandler;

    @Override
    public void handleRequest(OrderRequest request) {
        if (request.getRole().equals("admin") || request.getRole().equals("user")) {
            System.out.println("Authorization successful. Role: " + request.getRole());
            if (nextHandler != null) {
                nextHandler.handleRequest(request);
            }
        } else {
            System.out.println("User not authorized.");
        }
    }

    @Override
    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }
}