
public class EWasteFee extends ItemDecorator{
    Item item;
    
    public EWasteFee(Item item) {
    	this.item = item;
    }
    
    public String getDescription() {
    	return item.getDescription() + ", E-Waste Fee";
    }
    
    public double cost() {
    	return 1.07 * item.cost() + 5.0;
    }
}
