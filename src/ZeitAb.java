import java.util.Date;


public class ZeitAb implements Zeitraum{
	private Date von;
	
	public ZeitAb(Date von) {
		this.von = von;
	}

	@Override
	public boolean inZeitraum(Date zeitpunkt) {
		return zeitpunkt.after(von);
	}

	@Override
	public String toString()
	{
		return "[ " + von.toString() + " - ]";
	}
}
