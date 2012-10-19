import java.util.Calendar;
import java.util.Date;

public class Test {
	private static Date toDate(int jahr, int monat, int tag) {
		Calendar kalender = Calendar.getInstance();
		kalender.set(jahr, monat - 1, tag);
		return kalender.getTime();
	}

	private static Date toDate(int jahr, int monat, int tag, int stunde,
			int minute) {
		Calendar kalender = Calendar.getInstance();
		kalender.set(jahr, monat - 1, tag, stunde, minute);
		return kalender.getTime();
	}

	public static void main(String[] args) {
		System.out.println("Teste Band");
		System.out.println();
		testeBand();
		System.out.println();
		System.out.println();
		System.out.println("Teste Mitglieder");
		System.out.println();
		testeMitglieder();
		System.out.println();
		System.out.println();
		System.out.println("Teste Repertoire");
		System.out.println();
		testeRepertoire();
		System.out.println();
		System.out.println();
		System.out.println("Teste Termine");
		System.out.println();
		testeTermine();

	}

	/**
	 * Testet die Klasse Band
	 */
	private static void testeBand() {

		// Testfall: Band erstellen und ausgeben.
		// Die Band "Green Day" wird erstellt und ausgegeben.
		//
		// Erwartete Ausgabe: "Green Day, Rock"

		Band band = new Band("Green Day", "Rock");
		System.out.println(band);
		System.out.println();
	}

	/**
	 * Testet die Klassen Termine, Termin, Proben, Auftritte
	 */
	private static void testeTermine() {
		Termin termin;
		Zeitraum zeitraum;
		ZeitIntervall zeitIntervall;
		Band band = new Band("Green Day", "Rock");

		
		// Testfall: Auftritte erstellen und ausgegeben.
		// Es werden 3 neue Auftritte erstellt und ausgegeben.
		//
		// Erwartete Ausgabe (fuer alle 3 Auftritte):
		// + Auftritt: <Ort> [<von> - <bis>], Gage: <Gage mit 2 Nachkommastellen>

		zeitIntervall = new ZeitIntervall(toDate(2012, 9, 1, 18, 0), toDate(
				2012, 9, 2, 1, 0));
		termin = new Auftritt("Konstanz", zeitIntervall, 100000);
		band.getTermine().add(termin);
		System.out.println("+ " + termin.toDetailString());

		zeitIntervall = new ZeitIntervall(toDate(2012, 8, 30, 16, 0), toDate(
				2012, 8, 30, 23, 0));
		termin = new Auftritt("Berlin", zeitIntervall, 250000);
		band.getTermine().add(termin);
		System.out.println("+ " + termin.toDetailString());

		zeitIntervall = new ZeitIntervall(toDate(2010, 7, 1, 17, 0), toDate(
				2010, 7, 1, 22, 0));
		termin = new Auftritt("Mainz", zeitIntervall, 80000);
		band.getTermine().add(termin);
		System.out.println("+ " + termin.toDetailString());

		
		// Testfall: Proben erstellen und ausgegeben.
		// Es werden 3 neue Proben erstellt und ausgegeben.
		//
		// Erwartete Ausgabe (fuer alle 3 Proben):
		// + Probe: <Ort> [<von> - <bis>], Raummiete: <Raummiete mit 2 Nachkommastellen>

		zeitIntervall = new ZeitIntervall(toDate(2012, 7, 1, 8, 0), toDate(
				2012, 7, 1, 15, 0));
		termin = new Probe("Studio", zeitIntervall, 10000);
		band.getTermine().add(termin);
		System.out.println("+ " + termin.toDetailString());

		zeitIntervall = new ZeitIntervall(toDate(2012, 7, 20, 10, 0), toDate(
				2012, 7, 20, 20, 0));
		termin = new Probe("zu Hause", zeitIntervall, 10);
		band.getTermine().add(termin);
		System.out.println("+ " + termin.toDetailString());

		zeitIntervall = new ZeitIntervall(toDate(2010, 9, 1, 9, 0), toDate(
				2010, 9, 1, 18, 0));
		termin = new Probe("Stadthalle", zeitIntervall, 20000);
		band.getTermine().add(termin);
		System.out.println("+ " + termin.toDetailString());
		System.out.println();
		
		
		// Testfall: Termine, Kosten und Gewinn ausgeben
		//
		// Erwartete Ausgabe:
		// Termine:
		// [<Auftritt 1>, ... , <Auftritt 3>, <Probe 1>, ... , <Probe 3>]
		// Gewinn: 399990.0
		// Kosten: 30010.0
		
		System.out.println("Termine: ");
		System.out.println(band.getTermine());
		System.out.println("Gewinn: " + band.getTermine().getGewinn());
		System.out.println("Kosten: " + band.getTermine().getKosten());
		System.out.println();

		
		// Testfall: Termine, Kosten und Gewinn ausgeben (im Zeitraum 02.07.2012 - 01.09.2012)
		//
		// Erwartete Ausgabe:
		// Termine [02.07.2012 - 01.09.2012]:
		// [<Auftritt in Berlin>, <Probe zu Hause>]
		// Gewinn: 249990.0
		// Kosten: 10.0
		
		zeitraum = new ZeitIntervall(toDate(2012, 7, 2), toDate(2012, 9, 1));
		System.out.println("Termine " + zeitraum + ": ");
		System.out.println(band.getTermine(zeitraum));
		System.out.println("Gewinn: " + band.getTermine(zeitraum).getGewinn());
		System.out.println("Kosten: " + band.getTermine(zeitraum).getKosten());
		System.out.println();


		// Testfall: Proben, Kosten und Gewinn ausgeben (im Zeitraum 02.07.2012 - 01.09.2012)
		//
		// Erwartete Ausgabe:
		// Proben [02.07.2012 - 01.09.2012]:
		// [<Probe zu Hause>]
		// Gewinn: -10.0
		// Kosten: 10.0
		
		System.out.println("Proben " + zeitraum + ": ");
		System.out.println(band.getProben(zeitraum));
		System.out.println("Gewinn: " + band.getProben(zeitraum).getGewinn());
		System.out.println("Kosten: " + band.getProben(zeitraum).getKosten());
		System.out.println();

		
		// Testfall: Auftritte, Kosten und Gewinn ausgeben (im Zeitraum 02.07.2012 - 01.09.2012)
		//
		// Erwartete Ausgabe:
		// Auftritte [02.07.2012 - 01.09.2012]:
		// [<Auftritt in Berlin>]
		// Gewinn: 250000.0
		// Kosten: 0.0
		
		System.out.println("Auftritte " + zeitraum + ": ");
		System.out.println(band.getAuftritte(zeitraum));
		System.out
				.println("Gewinn: " + band.getAuftritte(zeitraum).getGewinn());
		System.out
				.println("Kosten: " + band.getAuftritte(zeitraum).getKosten());
		System.out.println();


		// Testfall: Termine entfernen
		// Auftritt in Berlin und Probe zu Hause werden entfernt. Und die Uebrigen Termine ausgegeben.
		//
		// Erwartete Ausgabe:
		// - <Auftritt in Berlin>
		// - <Probe zu Hause>
		//
		// Termine:
		// [<Auftritt in Konstanz>, <Auftritt in Mainz>, <Probe im Studio>, <Probe in der Stadthalle>]
		// Gewinn: 150000.0
		// Kosten: 30000.0
		
		termin = band.getTermine().get(1);
		band.getTermine().remove(termin);
		System.out.println("- " + termin.toDetailString());

		termin = band.getTermine().get(3);
		band.getTermine().remove(termin);
		System.out.println("- " + termin.toDetailString());
		
		System.out.println();
		System.out.println("Termine: ");
		System.out.println(band.getTermine());
		System.out.println("Gewinn: " + band.getTermine().getGewinn());
		System.out.println("Kosten: " + band.getTermine().getKosten());
		System.out.println();
	}

	/**
	 * Testet die Klassen Songs und Song
	 */
	private static void testeRepertoire() {
		Song song;
		Zeitraum zeitraum;
		Band band = new Band("Green Day", "Rock");

		
		// Testfall: Songs anlegen
		// Es werden 3 neue Songs erstellt und ausgegeben.
		//
		// Erwartete Ausgabe (fuer alle 3 Songs):
		// + <Songtitel> (<Dauer in mm:ss>) [<von> - <bis (optional)>]
		
		zeitraum = new ZeitAb(toDate(2005, 3, 6));
		song = new Song("Holiday", 200, zeitraum);
		band.getRepertoire().add(song);
		System.out.println("+ " + song.toDetailString());

		zeitraum = new ZeitIntervall(toDate(1994, 2, 3), toDate(2004, 5, 3));
		song = new Song("Basketcase", 195, zeitraum);
		band.getRepertoire().add(song);
		System.out.println("+ " + song.toDetailString());

		zeitraum = new ZeitAb(toDate(2004, 4, 4));
		song = new Song("American Idiot", 195, zeitraum);
		band.getRepertoire().add(song);
		System.out.println("+ " + song.toDetailString());
		System.out.println();

		
		// Testfall: Repertoire ausgeben
		//
		// Erwartete Ausgabe:
		// Repertoire:
		// [<Song 1>, ... , <Song 3>]
		
		System.out.println("Repertoire: ");
		System.out.println(band.getRepertoire());
		System.out.println();
		

		// Testfall: Repertoire vom 1.1.2000 ausgeben
		//
		// Erwartete Ausgabe:
		// Repertoire am 1.1.2000:
		// [<Song Basketcase>]
		
		System.out.println("Repertoire am 1.1.2000: ");
		System.out.println(band.getRepertoire(toDate(2000, 1, 1)));
		System.out.println();
		

		// Testfall: Repertoire vom 1.1.2012 ausgeben
		//
		// Erwartete Ausgabe:
		// Repertoire am 1.1.2012:
		// [<Song Holiday>, <Song American Idiot>]
		
		System.out.println("Repertoire am 1.1.2012: ");
		System.out.println(band.getRepertoire(toDate(2012, 1, 1)));
		System.out.println();


		// Testfall: Song entfernen
		// Basketcase wird entfernt und alle uebrigen Songs ausgegeben.
		//
		// Erwartete Ausgabe:
		// - <Song (detailierte Ausgabe)>
		//
		// Repertoire:
		// [<Song Holiday>, <Song American Idiot>]
		
		song = band.getRepertoire().get(1);
		band.getRepertoire().remove(song);
		System.out.println("- " + song.toDetailString());

		System.out.println();
		System.out.println("Repertoire: ");
		System.out.println(band.getRepertoire());
		System.out.println();
	}

	/**
	 * Testet die Klassen Mitglieder und Mitglied
	 */
	private static void testeMitglieder() {
		Mitglied mitglied;
		Zeitraum zeitraum;
		Band band = new Band("Green Day", "Rock");

		
		// Testfall: Mitglieder anlegen
		// Es werden 4 neue Mitglieder erstellt und ausgegeben.
		//
		// Erwartete Ausgabe (fuer alle 4 Mitglieder):
		// + <Name> (<Instrument>) [<von> - <bis (optional)>]
		// TekefibNr: <Telefonnummer>

		zeitraum = new ZeitAb(toDate(1989, 3, 4));
		mitglied = new Mitglied("Billie Joe Armstrong", "123/45678", "Gitarre",
				zeitraum);
		band.getMitglieder().add(mitglied);
		System.out.println("+ " + mitglied.toDetailString());

		zeitraum = new ZeitAb(toDate(1989, 3, 4));
		mitglied = new Mitglied("Mike Dirnt", "321/12323", "Bass", zeitraum);
		band.getMitglieder().add(mitglied);
		System.out.println("+ " + mitglied.toDetailString());

		zeitraum = new ZeitIntervall(toDate(1989, 3, 4), toDate(1990, 1, 1));
		mitglied = new Mitglied("Al Sobrante", "345/54327", "Schlagzeug",
				zeitraum);
		band.getMitglieder().add(mitglied);
		System.out.println("+ " + mitglied.toDetailString());

		zeitraum = new ZeitAb(toDate(1990, 1, 1));
		mitglied = new Mitglied("Tre Cool", "943/38321", "Schlagzeug", zeitraum);
		band.getMitglieder().add(mitglied);
		System.out.println("+ " + mitglied.toDetailString());


		// Testfall: Mitglieder ausgeben
		//
		// Erwartete Ausgabe:
		// Mitglieder:
		// [<Mitglied 1>, ... , <Mitglied 4>]
		
		System.out.println();
		System.out.println("Mitglieder: ");
		System.out.println(band.getMitglieder());
		System.out.println();


		// Testfall: Mitglieder vom 31.12.1989 ausgeben
		//
		// Erwartete Ausgabe:
		// Mitglieder am 31.12.1989:
		// [<Billie Joe>, <Mike>, <Al Sobrante>]
		
		System.out.println("Mitglieder am 31.12.1989: ");
		System.out.println(band.getMitglieder(toDate(1989, 12, 31)));
		System.out.println();
		

		// Testfall: Mitglieder vom 2.1.1990 ausgeben
		//
		// Erwartete Ausgabe:
		// Mitglieder am 2.1.1990:
		// [<Billie Joe>, <Mike>, <Tre Cool>]
		
		System.out.println("Mitglieder am 2.1.1990: ");
		System.out.println(band.getMitglieder(toDate(1990, 1, 2)));
		System.out.println();

		
		// Testfall: Mitglied entfernen
		// Mike wird entfernt und alle uebrigen Mitglieder ausgegeben.
		//
		// Erwartete Ausgabe:
		// - <Mike (detailierte Ausgabe)>
		//
		// Mitglieder:
		// [<Billie Joe>, <Al Sobrante>, <Tre Cool>]
		
		mitglied = band.getMitglieder().get(1);
		band.getMitglieder().remove(mitglied);
		System.out.println("- " + mitglied.toDetailString());

		System.out.println();
		System.out.println("Mitglieder: ");
		System.out.println(band.getMitglieder());
		System.out.println();
	}
}
