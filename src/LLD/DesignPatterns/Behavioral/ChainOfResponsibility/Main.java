package LLD.DesignPatterns.Behavioral.ChainOfResponsibility;

public class Main {
    public static void main(String[] args) {
        // Create the handlers
        Handler authenticationHandler = new AuthenticationHandler();
        Handler authorizationHandler = new AuthorizationHandler();
        Handler orderHandler = new OrderHandler();

        // Set up the chain
        authenticationHandler.setNextHandler(authorizationHandler);
        authorizationHandler.setNextHandler(orderHandler);

        // Create an order request (Authenticated, Role: user)
        OrderRequest orderRequest = new OrderRequest("john_doe", "user", true);

        // Start the request processing
        authenticationHandler.handleRequest(orderRequest);
    }
}
