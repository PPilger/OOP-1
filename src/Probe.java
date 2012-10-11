/**
 * Speichert die probenspezifischen Eigenschaften eines Termins ab.
 * @author K�gler Alexander
 *
 */
public class Probe extends Termin {

	/**
	 * 
	 * @param ort Ort
	 * @param zeitraum Zeitraum
	 * @param dauer L�nge in ms.
	 * @param raummiete Miete f�r Veranstaltung
	 */
	public Probe(String ort, Zeitraum zeitraum, long dauer, double raummiete)
	{
		super(ort,zeitraum,dauer);
		this.raummiete = raummiete;
	}
	
	private double raummiete;
	
	@Override
	public Object getType() {
		return this.getClass();
	}

	@Override
	/**
	 * Proben lukrieren keinen Gewinn
	 * @return 0
	 */
	public double getGewinn() {
		return 0;
	}

	@Override
	/**
	 * Raummieten werden als Kosten verbucht
	 *  @return Raummiete 
	 */
	public double getKosten() {
		return raummiete;
	}

}
