//Creator class
public abstract class SlotMachineCompany {
	//factory method
	abstract SlotMachine createMachine(String type);
	
	//operation method 
	public SlotMachine orderMachine(String type) {
		SlotMachine machine;
		
		machine = createMachine(type);
		
		machine.assemble();
		machine.flashBios();
		machine.installOS();
		machine.installGames();
		machine.test();
		machine.box();
		
		return machine;
	}
	
}
