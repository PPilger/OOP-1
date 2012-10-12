/**
 * Speichert Ort, Zeitraum, Dauer ab. Bietet Methoden f�r die kaufm�nnische
 * Berechnungslehre.
 * 
 * @author K�gler Alexander
 * 
 */
public abstract class Termin implements HatZeitraum {

	public Termin(String ort, Zeitraum zeitraum) {
		this.ort = ort;
		this.zeitraum = zeitraum;
	}

	private String ort;
	private Zeitraum zeitraum;

	/**
	 * 
	 * @return Typ des Object
	 */
	public abstract Object getType();

	/**
	 * 
	 * @return Gewinn
	 */
	public double getGewinn()
	{
		return getUmsatz() - getKosten();
	}

	/**
	 * 
	 * @return Kosten
	 */
	public abstract double getKosten();

	/**
	 * Berechnet den Umsatz mittels Addition der Kosten und des Gewinns.
	 * 
	 * @return Umsatz
	 */
	public abstract double getUmsatz();

	/**
	 * @return Gibt das lokale Zeitintervall zur�ck
	 */
	public Zeitraum getZeitraum() {
		return zeitraum;
	}

}
