import java.text.DateFormat;
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
		DateFormat format = DateFormat.getDateInstance(DateFormat.SHORT);
		return toString(format);
	}
	
	public String toString(DateFormat format)
	{
		return "[ seit " + format.format(von) + " ]";
	}
}
