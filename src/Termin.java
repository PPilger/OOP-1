/**
 * Speichert Ort, Zeitraum, Dauer ab. Bietet Methoden für die kaufmännische Berechnungslehre.
 * @author Kögler Alexander
 *
 */
public abstract class Termin implements HatZeitraum{

	public Termin(String ort, Zeitraum zeitraum, long dauer)
	{
		this.ort = ort;
		this.zeitraum = zeitraum;
		this.dauer = dauer;
	}
	
	private String ort;
	private Zeitraum zeitraum;
	private long dauer;
	
	/**
	 * 
	 * @return Typ des Object
	 */
	public abstract Object getType();
	/**
	 * 
	 * @return Gewinn
	 */
	public abstract double getGewinn();
	/**
	 * 
	 * @return Kosten
	 */
	public abstract double getKosten();
	
	/**
	 * Berechnet den Umsatz mittels Addition der Kosten und des Gewinns.
	 * @return Umsatz
	 */
	public double getUmsatz()
	{
		return getGewinn() + getKosten();
	}
	
	/**
	 *  @return Gibt das lokale Zeitintervall zurück 
	 */
	public Zeitraum getZeitraum()
	{
		return zeitraum;		
	}
	
}
