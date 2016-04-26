
public class UStoUKSocketAdapter implements Socket {

	private Outlet plug;

	public UStoUKSocketAdapter(Outlet plug) {
		this.plug = plug;
	}

	@Override
	public Volt getVolt() {
		// TODO Auto-generated method stub
		Volt volts = this.plug.voltage();
		int value = volts.getVolts();
		
		return new Volt(value * 2);
	}

}
