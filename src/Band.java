/**
 * 
 * @author Christian Kletzander
 * 
 */
public class Band {

	// Variablendefinition
	private String name;
	private String ausrichtung;
	private Songs repertoire;
	private Termine termine;
	private Mitglieder mitglieder;

	// Konstruktor
	public Band(String name, String ausrichtung) {
		this.name = name;
		this.ausrichtung = ausrichtung;

		this.repertoire = new Songs();
		this.termine = new Termine();
		this.mitglieder = new Mitglieder();
	}

	public Songs getRepertoire() {
		return this.repertoire;
	}

	public Termine getTermine() {
		return this.termine;
	}

	public Mitglieder getMitglieder() {
		return this.mitglieder;
	}

	public String toString() {
		return this.name + ", " + this.ausrichtung;
	}

}
