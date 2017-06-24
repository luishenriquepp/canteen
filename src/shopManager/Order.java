package shopManager;

import shopClient.ClientTerminal;

public class Order {
    private ClientTerminal client;
    private Unit ordered;
    
    public Order() { }
    
    public Order(ClientTerminal client, Unit ordered) {
        this.client = client;
        this.ordered = ordered;
    }
    
    public ClientTerminal getClient() {
        return this.client;
    }
    
    public Unit getOrdered() {
        return this.ordered;
    }
    
    public double getCash() {
        return this.client.getCash();
    }
}
