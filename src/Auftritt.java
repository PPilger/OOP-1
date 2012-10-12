/**
 * Speichert die auftrittspezifischen Eigenschaften eines Termins
 * @author K�gler Alexander
 *
 */
public class Auftritt extends Termin {

	private double gage;
	
	/**
	 * 
	 * @param ort Ort
	 * @param zeitraum Zeitraum
	 * @param dauer L�nge in ms.
	 * @param gage Gage
	 */
	public Auftritt(String ort, Zeitraum zeitraum, double gage)
	{
		super(ort,zeitraum);
		this.gage = gage;
	}
	
	@Override
	public Object getType() {
		return getClass();
	}

	@Override
	/**
	 * Gagen werden als Gewinn verbucht
	 * @return Gage
	 */
	public double getGewinn() {
		return this.gage;
	}

	@Override
	/**
	 * Auftritte haben keinerlei Kosten
	 * @return 0
	 */
	public double getKosten() {
		return 0;
	}	
}
