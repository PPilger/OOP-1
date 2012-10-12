/**
 * Speichert die auftrittspezifischen Eigenschaften eines Termins.
 * 
 * @author Kögler Alexander
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
	 *            Länge in ms.
	 * @param gage
	 *            Gage
	 */
	public Auftritt(String ort, Zeitraum zeitraum, double gage) {
		super(ort, zeitraum);
		this.gage = gage;
	}

	@Override
	public Object getType() {
		return getClass();
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
}
