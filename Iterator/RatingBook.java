import java.util.Iterator;

public interface RatingBook {
	public Iterator createIterator();
	public void addPlayer(String name, int rating);
}
