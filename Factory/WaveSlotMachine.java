
public class WaveSlotMachine extends SlotMachine {

	public WaveSlotMachine() {
		name = "Wave Display Machine";
		bios = "286a";
		os = "810c";

		for (int i = 0; i < 5; i++) {
			games.add("Tetris");
			games.add("Star Trek");
			games.add("Monopoly");
			games.add("Playboy");
			games.add("Harley Davis");

		}
	}
}
