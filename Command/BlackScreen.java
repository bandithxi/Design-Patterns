
public class BlackScreen implements Job {

	GPU gpu;

	public BlackScreen(GPU gpu) {
		this.gpu = gpu;
	}

	public void undo() {
		gpu.buffer();
		gpu.render();
	}

	public void execute() {
		gpu.clear();
	}

}
