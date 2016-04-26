//Analogous to Receiver in UML
public class GPU {
	private String name;
	
	public GPU(String name) {
		this.name = name;
	}
	
	public void render() {
		System.out.println(this.name + " Display scene from vram");
	}

	public void buffer() {
		System.out.println(this.name + " Buffer scene to vram");
	}
	
	public void clear() {
		System.out.println(this.name + " Clear vram\n");
	}
}
