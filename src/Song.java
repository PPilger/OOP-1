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
		// TODO Auto-generated method stub
		return null;
	}

}
