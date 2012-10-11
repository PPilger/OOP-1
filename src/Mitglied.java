
public class Mitglied extends HatZeitraumCollection<Object> {
	
	//Variablendefinition
	//TODO: Besprechen was public und private
	public String sName;
	public int iTelNr;
	public String sInstrument;
	public Zeitraum oZeitraum;
	
	//Konstruktor
	public Mitglied(String sName, int iTelNr, String sInstrument, Zeitraum oZeitraum) {
		this.sName = sName;
		this.iTelNr = iTelNr;
		this.sInstrument = sInstrument;
		this.oZeitraum = oZeitraum;
	}
	
	
	
	
	
}
