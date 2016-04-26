//Analogous to Receiver in UML
public class CPU {
	private String name;
	
	public CPU(String name) {
		this.name = name;
	}
	
	public void execute() {
		System.out.println(this.name + " Executes");
	}

	public void flush() {
		System.out.println(this.name + " flush cache");
	}
}
