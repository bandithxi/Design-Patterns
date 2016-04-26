import java.util.Iterator;

public class HighSchoolTeacher {
	RatingBook sportsBook;
	RatingBook classBook;

	public HighSchoolTeacher(RatingBook sports, RatingBook classBook) {
		this.sportsBook = sports;
		this.classBook = classBook;
	}

	public void printMenu() {
		Iterator athleteIterator = this.sportsBook.createIterator();
		Iterator studentIterator = this.classBook.createIterator();

		System.out.println("Athlete performance");
		printMenu(athleteIterator);

		System.out.println("Student performance");
		printMenu(studentIterator);
	}

	public void printMenu(Iterator iterator) {
		while (iterator.hasNext()) {
			Player cur = (Player) iterator.next();

			System.out.println("Name: " + cur.getName() 
			+ "\nRating: " + cur.getRating());

		}
	}

	public static void main(String args[]) {
		RatingBook sports = new AthleticPerformanceBook();
		RatingBook chess = new ChessRatingBook();

		chess.addPlayer("Carlsen", 2800);
		chess.addPlayer("Fischer", 2750);
		chess.addPlayer("Anand", 2690);
		chess.addPlayer("Kasparov", 2740);

		sports.addPlayer("Lebron", 20000);
		sports.addPlayer("MJ", 32000);
		sports.addPlayer("Kobe", 28000);

		HighSchoolTeacher teacher = new HighSchoolTeacher(sports, chess);

		teacher.printMenu();
	}
}
