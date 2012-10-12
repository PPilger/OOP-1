/**
 * Speichert die auftrittspezifischen Eigenschaften eines Termins.
 * 
 * @author K�gler Alexander
 * 
 */
public class Auftritt extends Termin {

	private double gage;

	/**
	 * 
	 * @param ort
	 *            Ort
	 * @param zeitraum
	 *            Zeitraum
	 * @param dauer
	 *            L�nge in ms.
	 * @param gage
	 *            Gage
	 */
	public Auftritt(String ort, Zeitraum zeitraum, double gage) {
		super(ort, zeitraum);
		this.gage = gage;
	}

	@Override
	/**
	 * Auftritte haben keinerlei Kosten
	 * @return 0
	 */
	public double getKosten() {
		return 0;
	}

	@Override
	public double getUmsatz() {
		return gage;
	}

	@Override
	public String toString() {
		return "Auftritt: " + super.toString();
	}

	@Override
	public String toDetailString() {
		return String.format("%s, Gage: %,.2f", toString(), gage);
	}
}
