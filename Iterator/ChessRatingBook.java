/*ArrayList example*/

import java.util.ArrayList;
import java.util.Iterator;

public class ChessRatingBook implements RatingBook {
	private ArrayList players;

	public ChessRatingBook() {
		players = new ArrayList();
		
	}

	public void addPlayer(String name, int elo) {
		ChessPlayer player = new ChessPlayer(name, elo);
		players.add(player);
		
	}
	public Iterator createIterator() {
		return players.iterator();
	}

}
