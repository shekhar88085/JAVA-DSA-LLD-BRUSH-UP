package LLD.DesignPatterns.Behavioral.ChainOfResponsibility;

public class OrderRequest {
    private String username;
    private String role;
    private boolean authenticated;

    public OrderRequest(String username, String role, boolean authenticated) {
        this.username = username;
        this.role = role;
        this.authenticated = authenticated;
    }

    public String getUsername() {
        return username;
    }

    public String getRole() {
        return role;
    }

    public boolean isAuthenticated() {
        return authenticated;
    }
}
