package shopManager;

public class Unit {
    private int id;
    private int quantity;
    private String description;
    private double price;
    
    public Unit() { }
    
    public Unit(int id, int quantity, String description, double price) {
        this.id = id;
        this.quantity = quantity;
        this.description = description;
        this.price = price;
    }
    
    public int getId() {
        return this.id;
    }
    
    public int getQuantity() {
        return this.quantity;
    }
    
    public String getDescription() {
        return this.description;
    }
    
    public double getPrice() {
        return this.price;
    }
   
    public void reduce() {
        if(this.quantity > 0) this.quantity -= 1;
    }
}
