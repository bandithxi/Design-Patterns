public class DownloadRequest implements Job {

	Network network;

	public DownloadRequest(Network network) {
		this.network = network;
	}

	public void execute() {
		network.ping();
		network.send();
		System.out.println("Download\n");
	}

	public void undo() {
		network.ping();
	    network.receive();
		System.out.println(" UnDownload\n");
	}

}
