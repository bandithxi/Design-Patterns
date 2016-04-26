
public class simThread {
	private int runtime;
	private Job job;
	private boolean busy;

	public simThread() {
		this.runtime = -1;
		this.busy = false;
	}

	public void run() {

		if (this.runtime == 0) {
			this.job.execute();
			this.busy = false;
		} 
		
		this.runtime--;

	}

	public void assignJob(int rtime, Job job) {
		this.runtime = rtime;
		this.job = job;
		this.busy = true;
	}
	
	public boolean isBusy() {
		return this.busy;
	}
}
