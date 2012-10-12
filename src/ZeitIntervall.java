import java.util.Date;

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
	 * @param von
	 *            Anfang des Zeitintervalls, darf nicht null sein!
	 * @param bis
	 *            Ende des Zeitiuntervalls, darf nicht null sein!
	 * 
	 */
	public ZeitIntervall(Date von, Date bis) {
		// "von" ist nach "bis" Widerspruch!
		if (von.after(bis)) {
			this.von = bis;
			this.bis = von;
		} else {
			this.bis = bis;
			this.von = von;
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

}
