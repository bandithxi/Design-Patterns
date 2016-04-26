
public class IGT extends SlotMachineCompany {
	public SlotMachine createMachine(String type) {

		if (type.equals("Double Screen")) {
			return new TwentySevenTwentyTwoSlotMachine();

		} else if (type.equals("Big Screen")) {
			return new WaveSlotMachine();

		} else if (type.equals("Reel")) {
			return new ReelSlotMachine();
		}

		return null;

	}

}
