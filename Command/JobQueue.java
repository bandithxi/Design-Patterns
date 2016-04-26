import java.util.Random;

// Analogous to the invoker in UML
public class JobQueue {
	java.util.Queue<Job> jobs;
	simThread[] threads;

	public JobQueue(simThread[] threads) {
		jobs = new java.util.LinkedList<Job>();
		this.threads = threads;
	}

	public void addJob(Job job) {
		jobs.add(job);
	}

	// simulates
	public void run() {
		while (!done()) {
			int size = this.threads.length;
			
			assignJobs();

			for (int i = 0; i < size; i++) {
				this.threads[i].run();
			}

		}
	}

	public void assignJobs() {
		int size = this.threads.length;

		// check if we have jobs
		if (!jobs.isEmpty()) {

			int count = 0;
			boolean found = false;
			Random rtime = new Random();

			// check if we have available threads
			while (!found && count < size) {
				if (!this.threads[count].isBusy()) {
					found = true;
					// give available threads jobs
					this.threads[count].assignJob(rtime.nextInt(10), jobs.remove());
				}
				count++;
			}

		}
	}

	public boolean done() {
		int size = this.threads.length;
		boolean done = true;

		for (int i = 0; i < size; i++) {
			done = done && !this.threads[i].isBusy();
		}

		return done && jobs.isEmpty();
	}

}
