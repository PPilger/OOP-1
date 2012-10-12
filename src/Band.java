
public class Band {

	private String name;
	private String ausrichtung;
	private Songs repertoire;
	private Termine termine;
	private Mitglieder mitglieder;
	
	//Konstruktor
	public Band (String name, String ausrichtung) {
		this.name = name;
		this.ausrichtung = ausrichtung;
		
		this.repertoire = new Songs();
		this.termine = new Termine();
		this.mitglieder = new Mitglieder();
		
	}
	
}
