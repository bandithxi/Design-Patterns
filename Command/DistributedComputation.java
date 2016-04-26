public class DistributedComputation implements Job {

	CPU cpu;

	public DistributedComputation(CPU cpu) {
		this.cpu = cpu;
	}

	public void execute() {
		cpu.execute();
		cpu.execute();
		cpu.execute();
		cpu.execute();
		System.out.println("Distributed Task\n");
	}

	public void undo() {
		cpu.flush();
		cpu.flush();
		cpu.flush();
		cpu.flush();
		System.out.println("Flush cache Task\n");
	}

}
