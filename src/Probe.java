/**
 * Speichert die probenspezifischen Eigenschaften eines Termins ab.
 * 
 * @author K�gler Alexander
 * 
 */
public class Probe extends Termin {

	/**
	 * 
	 * @param ort
	 *            Ort
	 * @param zeitraum
	 *            Zeitraum
	 * @param dauer
	 *            L�nge in ms.
	 * @param raummiete
	 *            Miete f�r Veranstaltung
	 */
	public Probe(String ort, Zeitraum zeitraum, double raummiete) {
		super(ort, zeitraum);
		this.raummiete = raummiete;
	}

	private double raummiete;

	@Override
	/**
	 * Raummieten werden als Kosten verbucht
	 *  @return Raummiete 
	 */
	public double getKosten() {
		return raummiete;
	}

	@Override
	public double getUmsatz() {
		return raummiete;
	}

}
