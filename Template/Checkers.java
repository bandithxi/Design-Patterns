
public class Checkers extends Game {

	private int turn = 0;

	void loadAssets() {
		System.out.println("Load checkers board");
		System.out.println("Load black pieces");
		System.out.println("Load red pieces");
	}

	void turn(int player) {
	

		if (player == 0) {
			this.turn++;
			
			System.out.println("Black player's turn " + this.turn);
		} else {
			System.out.println("Red player's turn " + this.turn);
		}
	}

	@Override
	boolean gameOver() {
		if (turn > 20) {
			return true;
		}
		return false;
	}

	@Override
	void printWinner() {
		System.out.println("No one wins because it's checkers");
	}

}
