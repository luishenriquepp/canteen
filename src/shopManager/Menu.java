package shopManager;

import java.util.ArrayList;
import java.util.List;

public class Menu {    
    private final List<Unit> units;
    
    public Menu() {
//      add more flavours here if you wish
        this.units = new ArrayList<>();
        units.add(new Unit(1, 4, "Calabria", 26));
        units.add(new Unit(2, 3, "Pepperoni", 30));
        units.add(new Unit(3, 3, "Cheese", 19));
        units.add(new Unit(4, 3, "Chocolate", 15));
        units.add(new Unit(5, 1, "Strawberry", 15));
    }
    
    public List<Unit> getMenu() {
        return this.units;
    }
}
