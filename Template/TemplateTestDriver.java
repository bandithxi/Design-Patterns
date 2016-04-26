abstract class Game {
    
	// Hook methods
    protected int numPlayers;
    abstract void loadAssets();
    abstract void turn(int player);
    abstract boolean gameOver();
    abstract void printWinner();

    // Template methods
    public final void playGame(int numPlayers) {
        this.numPlayers = numPlayers;
        
        loadAssets();
        int curPlayer = 0;
        while (!gameOver()) {
            turn(curPlayer);
            curPlayer = (curPlayer + 1) % this.numPlayers;
        }
        printWinner();
    }
}

