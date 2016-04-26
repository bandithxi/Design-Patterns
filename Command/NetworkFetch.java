public class NetworkFetch implements Job {

	Network network;

	public NetworkFetch(Network network) {
		this.network = network;
	}

	public void execute() {
		network.ping();
		network.receive();
		System.out.println("Network Fetch\n");
	}

	public void undo() {
		network.ping();
	    network.send();
		System.out.println("Undo Network Fetch\n");
	}

}
