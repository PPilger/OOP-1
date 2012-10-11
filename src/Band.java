
public class Band {

	//TODO: Besprechen was public oder private
	public String sName;
	public String sAusrichtung;
	public Repertoires oRepertoire;
	public Termine oTermine;
	public Mitglieder oMitglieder;
	
	//Konstruktor
	public Band (String sName, String sAusrichtung) {
		this.sName = sName;
		this.sAusrichtung = sAusrichtung;
		
		this.oRepertoire = new Repertoires();
		this.oTermine = new Termine();
		this.oMitglieder = new Mitglieder();
		
	}
	
}
