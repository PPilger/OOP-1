
private class Mitglied implements HatZeitraumCollection<Object> {
	
	//Variablendefinition
	private String name;
	private int telNr;
	private String instrument;
	private Zeitraum zeitraum;
	
	//Konstruktor
	public Mitglied(String name, int telNr, String instrument, Zeitraum zeitraum) {
		this.name = name;
		this.telNr = telNr;
		this.instrument = instrument;
		this.zeitraum = zeitraum;
	}
	
	
	
	
	
}
