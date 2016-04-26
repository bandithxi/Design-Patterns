import java.util.Iterator;

public class AthleticPerformanceBook implements RatingBook {
	private static final int MAX_PLAYERS = 11;
	private int numPlayers = 0;
	private Athlete[] athletes;

	public AthleticPerformanceBook() {
		athletes = new Athlete[MAX_PLAYERS];
	}

	public void addPlayer(String name, int goals) {
		Athlete player = new Athlete(name, goals);
		
		if (numPlayers >= MAX_PLAYERS) {
			System.err.println("Too many athletes in book!");
		} else {
			athletes[numPlayers] = player;
			numPlayers++;
		}
		
	}
	public Iterator createIterator() {
		return new AthleteIterator(athletes);
	}

}
