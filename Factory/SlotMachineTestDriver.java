
public class SlotMachineTestDriver {

	public static void main(String[] args) {
		SlotMachineCompany bally = new BallyTech();
		SlotMachineCompany igt = new IGT();

		SlotMachine order1 = bally.orderMachine("Dual Screen");
		SlotMachine order2 = bally.orderMachine("Gaint Screen");
		SlotMachine order3 = bally.orderMachine("Reel");

		System.out.println(
				"Pechanga Casino orders " + order1.getName() + ", " 
		         + order2.getName() + ", " + order3.getName());

		order1 = igt.orderMachine("Double Screen");
		order2 = igt.orderMachine("Big Screen");
		order3 = igt.orderMachine("Reel");

		System.out.println(
				"Winstar Casino orders " + order1.getName() + ", " 
		         + order2.getName() + ", " + order3.getName());

	}

}
