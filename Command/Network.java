//Analogous to Receiver in UML
public class Network {
	private String name;
	
	public Network(String name) {
		this.name = name;
	}
	
	public void send() {
		System.out.println(this.name + " Sends");
	}

	public void receive() {
		System.out.println(this.name + " Receives");
	}
	
	public void ping() {
		System.out.println(this.name + " Pings");
	}
}
