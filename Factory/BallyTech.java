public class BallyTech extends SlotMachineCompany {

	public SlotMachine createMachine(String type) {

		if (type.equals("Dual Screen")) {
			return new TwentySevenTwentyTwoSlotMachine();

		} else if (type.equals("Gaint Screen")) {
			return new WaveSlotMachine();
			
		} else if (type.equals("Reel")) {
			return new ReelSlotMachine();
		}

		return null;

	}

}
