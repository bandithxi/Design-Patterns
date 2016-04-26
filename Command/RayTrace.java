public class RayTrace implements Job {

	GPU gpu;

	public RayTrace(GPU gpu) {
		this.gpu = gpu;
	}

	public void execute() {
		gpu.buffer();
		gpu.render();
		System.out.println();
	}

	public void undo() {
		gpu.clear();
		System.out.println();
	}

}
