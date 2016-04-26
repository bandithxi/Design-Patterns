
public class CaliforniaTax extends ItemDecorator{
	    Item item;
	    
	    public CaliforniaTax(Item item) {
	    	this.item = item;
	    }
	    
	    public String getDescription() {
	    	return item.getDescription() + ", California Tax";
	    }
	    
	    public double cost() {
	    	return 1.10 * item.cost();
	    }
}
