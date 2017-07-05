package shopManager;

import shopServer.ClientThread;

public class Order {
    private ClientThread client;
    private Unit ordered;
    
    public Order() { }
    
    public Order(ClientThread client, Unit ordered) {
        this.client = client;
        this.ordered = ordered;
    }
    
    public ClientThread getClient() {
        return this.client;
    }
    
    public Unit getOrdered() {
        return this.ordered;
    }
    
    public double getCash() {
        return this.client.getCash();
    }
}
