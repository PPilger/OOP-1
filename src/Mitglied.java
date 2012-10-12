/**
 * 
 * @author Christian Kletzander
 * 
 */
public class Mitglied implements HatZeitraum {

	// Variablendefinition
	private String name;
	private int telNr;
	private String instrument;
	private Zeitraum zeitraum;

	// Konstruktor
	public Mitglied(String name, int telNr, String instrument, Zeitraum zeitraum) {
		this.name = name;
		this.telNr = telNr;
		this.instrument = instrument;
		this.zeitraum = zeitraum;
	}

	@Override
	public Zeitraum getZeitraum() {
		return this.zeitraum;
	}

	public String toString() {
		return "Mitgliedname: " + this.name + "\n" + "TelefonNr.: "
				+ this.telNr + "\n" + "Instrument: " + this.instrument + "\n"
				+ "Mitgliedszeitraum: " + this.zeitraum;
	}

}
