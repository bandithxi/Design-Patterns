public class FinancialComputation implements Job {

	CPU cpu;

	public FinancialComputation(CPU cpu) {
		this.cpu = cpu;
	}

	public void execute() {
		cpu.execute();
		System.out.println("Financial Task\n");
	}

	public void undo() {
		cpu.flush();
		System.out.println("UnDo Financial Task\n");
	}

}
