
public class Chess extends Game {

	private int turn = 0;
	
	void loadAssets() {
		System.out.println("Load chess board");
		System.out.println("Load White Pieces");
		System.out.println("Load Black Pieces");
	}

	void turn(int player) {
		
		if (player == 0) {
			this.turn++;
			
			System.out.println("White player's turn " + this.turn);
		} else {
			System.out.println("Black player's turn " + this.turn);
		}
	}

	boolean gameOver() {
		if (turn > 50) {
			return true;
		} 
		return false;
	}

	void printWinner() {
		System.out.println("Carlsen wins\n");
	}

}
