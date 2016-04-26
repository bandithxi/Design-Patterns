
public class PowerOutletTestDriver {

	public static void main(String[] args) {
		Outlet plug = new Plug();
		Socket socket = new UStoUKSocketAdapter(plug);
		
		//Disobeys the Law of Demeter
		System.out.println("U.S. outlets are " + plug.voltage().getVolts()
				+ " Volts");

		System.out.println("U.K. outlets are " + socket.getVolt().getVolts()
				+ " Volts");

	}

}
