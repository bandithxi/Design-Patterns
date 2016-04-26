import java.util.ArrayList;

public abstract class SlotMachine {
	String name;
	String bios;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBios() {
		return bios;
	}

	public void setBios(String bios) {
		this.bios = bios;
	}

	public String getOs() {
		return os;
	}

	public void setOs(String os) {
		this.os = os;
	}

	public ArrayList<String> getGames() {
		return games;
	}

	public void setGames(ArrayList<String> games) {
		this.games = games;
	}

	String os;
	ArrayList<String> games = new ArrayList<String>();
	
	public void assemble() {
		System.out.println("Preparing " + name);
		System.out.println("Gathering case");
		System.out.println("Gathering bios");
		System.out.println("Gathering OS");
		System.out.println("Gathering these games:");
		
		for (int i = 0; i < games.size(); i++) {
			System.out.print(" " + games.get(i));
			
		}
		
	}
	
	public void flashBios() {
		System.out.println("Flash bios ver.: " + bios);
	}
	
	public void installOS() {
		System.out.println("Installing OS ver.: " + os);
	}
	
	public void test() {
		System.out.println("Tests passed!");
	}
	
	public void box() {
		System.out.println("Gather tape");
		System.out.println("Gather peanuts");
		System.out.println("Gather box");
		System.out.println("Place items in box");
		System.out.println("Seal box");
	}
	
	public void installGames() {
		for (int i = 0; i < games.size(); i++) {
			System.out.println("Installing " + games.get(i));		
		}
	
		
	}
	
	
	
	
}
