import java.util.Iterator;

public class AthleteIterator implements Iterator<Athlete> {
	private Athlete[] players;
	private int pos = 0;

	public AthleteIterator(Athlete[] players) {
		this.players = players;
	}

	public boolean hasNext() {
		if (pos >= players.length || players[pos] == null) {
			return false;
		} else {
			return true;
		}

	}

	public Athlete next() {
		Athlete player = players[pos];
		pos++;

		return player;
	}

}
