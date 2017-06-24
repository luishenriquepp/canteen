package shopManager;

import java.util.List;
import java.util.Queue;

public class ShopManager {
    private final Menu menu = new Menu();
    private List<Order> orders;
    private Queue<Order> queue;
    
    public void add(Order order) throws Exception {
        if(order.getCash() <= order.getOrdered().getPrice()) {
            throw new Exception("This client doesn't have cash enough");
        }
        if(order.getOrdered().getQuantity() == 0) {
            throw new Exception("This unit is not available anymore");
        }                
        this.queue.add(order);
    }
    
    public Order retrieve() throws Exception {
        Order order = this.queue.poll();
        if(order == null) {
            throw new Exception("The queue is empty");
        }        
        order.getOrdered().reduce();
        return order;
    }
    
    public Menu getMenu() {
        return this.menu;
    }
}
