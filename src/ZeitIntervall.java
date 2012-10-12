import java.text.DateFormat;
import java.util.Date;

/**
 * Representiert einen Eindimensionalen Zeitabschnitt bestehend aus Anfang und
 * Ende mittels Date Object
 * 
 * @author K�gler Alexander
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
	 * �berpr�ft ob das Datum innerhalb des lokalen Intervalls liegt
	 * @param Darf nicht null sein
	 */
	public boolean inZeitraum(Date z) {
		return !(this.von.after(z) || this.bis.before(z));
	}

	@Override
	public String toString() {
		return toString(DateFormat.getDateInstance());
	}

	@Override
	public String toString(DateFormat format) {
		return "[" + format.format(von) + " - " + format.format(bis) + "]";
	}
}
