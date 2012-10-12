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
	 * ("bis") oder Anfang und Ende sind gleich. Ist nur eines der Date Objects
	 * NULL so wird automatisch die Referenz des anderen Objects übernommen.
	 * 
	 * @param von
	 *            Anfang des Zeitintervalls
	 * @param bis
	 *            Ende des Zeitiuntervalls
	 * @exception Sind
	 *                beide übergebenen Date Objects NULL so wird eine
	 *                IllegalArgumentException geworfen.
	 */
	public ZeitIntervall(Date von, Date bis) {
		if (von == null && bis == null) {
			throw new IllegalArgumentException(
					"angegebene Zeitintervalle (\"von\", \"bis\")sind beide NULL");
		} else {
			if (von == null) {
				von = bis;
			}

			if (bis == null) {
				bis = von;
			}
		}

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
	 * Überprüft ob sich das Intervall mit dem im @param z überschneiden. True wenn sie sich schneiden, sonst false. False wird auch dann zurückgegeben wenn @param z null ist.
	 */
	public boolean inZeitraum(Zeitraum zr) {
		
		if(ZeitIntervall.class == zr.getClass())
		{
			ZeitIntervall z = (ZeitIntervall) zr;
			// z liegt dann nicht in diesem Zeitraum, falls er vor "von" endet oder
			// nach "bis" anfaengt
			if (z == null || z.bis.before(this.von) || z.von.after(this.bis)) {
				return false;
			}
			return true;
		}
		
		return false;
	}

	@Override
	/**
	 * Überprüft ob das Datum innerhalb des lokalen Intervalls liegt
	 */
	public boolean inZeitraum(Date z) {
		if (z == null)
		{
			throw new IllegalArgumentException("Es wurde ein null Object übergeben!");
		}
		else
		{
			return this.bis.before(z) && this.bis.after(z);
		
		}
	}

}
