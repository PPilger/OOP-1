/**
 * 
 * @author Christian Kletzander
 * 
 */
public class Song implements HatZeitraum {

	private String name;
	private double laenge;
	private Zeitraum zeitraum;

	// Konstruktor
	public Song(String name, double laenge, Zeitraum zeitraum) {
		this.name = name;
		this.laenge = laenge;
		this.zeitraum = zeitraum;
	}

	@Override
	public Zeitraum getZeitraum() {
		return this.zeitraum;
	}

	public String toString() {
		return this.name + " (" + this.laenge + ") " + this.zeitraum;
	}
}
