import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * Representiert einen Eindimensionalen Zeitabschnitt bestehend aus Anfang und
 * Ende mittels Date Object
 * 
 * @author Kögler Alexander
 * 
 */
public class ZeitIntervall implements Zeitraum {

	private Date von;
	private Date bis;

	/**
	 * Erstellt ein neues Objekt. Der Anfang ("von") ist immer vor dem Ende
	 * ("bis").
	 * 
	 * @param Grenze
	 *            Anfang des Zeitintervalls, darf nicht null sein!
	 * @param Grenze
	 *            Ende des Zeitintervalls, darf nicht null sein!
	 * 
	 */
	public ZeitIntervall(Date grenze1, Date grenze2) {
		// "von" ist nach "bis" Widerspruch!
		if (grenze1.after(grenze2)) {
			this.von = grenze2;
			this.bis = grenze1;
		} else {
			this.von = grenze1;
			this.bis = grenze2;
		}
	}

	@Override
	/**
	 * Überprüft ob das Datum innerhalb des lokalen Intervalls liegt
	 * @param Darf nicht null sein
	 */
	public boolean inZeitraum(Date z) {
		return this.bis.before(z) && this.bis.after(z);
	}

	@Override
	public String toString()
	{
		DateFormat df = DateFormat.getDateInstance(DateFormat.SHORT, Locale.ENGLISH);
		
		return "[ " + df.format(von) + " <> " + df.format(bis) + " ]";
	}
}
