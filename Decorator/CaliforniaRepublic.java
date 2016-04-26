public class CaliforniaRepublic {

	public static void main(String[] args) {
		Item computer = new MacBook();
		Item water = new BottledWater();
		Item game = new ChessBoard();
		
		System.out.println(computer.getDescription() 
				+ " Base Cost: $" + computer.cost());
		System.out.println(water.getDescription() 
				+ " Base Cost: $" + water.cost());
		System.out.println(game.getDescription() 
				+ " Base Cost: $" + game.cost());
		
		computer = new CaliforniaTax(computer);
		computer = new EWasteFee(computer);
		computer = new Warranty(computer);
		
		System.out.println(computer.getDescription() 
				+ ": $" + computer.cost());
		
		water = new CRV(water);
		System.out.println(water.getDescription() 
				+ ": $" + water.cost());
		
		game = new CaliforniaTax(game);
		game = new Warranty(game);
		
		System.out.println(game.getDescription() 
				+ ": $" + game.cost());
		

	}

}
