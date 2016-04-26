
public class Warranty extends ItemDecorator{
    Item item;
    
    public Warranty(Item item) {
    	this.item = item;
    }
    
    public String getDescription() {
    	return item.getDescription() + ", Warranty";
    }
    
    public double cost() {
    	return item.cost() + 59.99;
    }
}
