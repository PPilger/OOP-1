import java.util.Calendar;
import java.util.Date;

public class Test {
	public static void main(String[] args) {
		Calendar kalender = Calendar.getInstance();
		Zeitraum zeitraum;
		ZeitIntervall zeitIntervall;

		Band band = new Band("Green Day", "Rock");

		{
			Mitglied mitglied;

			kalender.set(1987, 7, 5);
			zeitraum = new ZeitAb(kalender.getTime());
			mitglied = new Mitglied("Billie Joe Armstrong", "31/2345",
					"Gitarre", zeitraum);
			band.getMitglieder().add(mitglied);

			System.out.println("+ " + mitglied.toDetailString());

			kalender.set(1999, 6, 4);
			zeitraum = new ZeitAb(kalender.getTime());
			mitglied = new Mitglied("Mike Dirnt", "3123/2215", "Bass", zeitraum);
			band.getMitglieder().add(mitglied);

			System.out.println("+ " + mitglied.toDetailString());
		}
		System.out.println(band.getMitglieder());

		kalender.set(1987, 7, 4);
		System.out.println(band.getMitglieder(kalender.getTime()));

		{
			Song song;

			kalender.set(1990, 1, 1);
			zeitraum = new ZeitAb(kalender.getTime());
			song = new Song("Holiday", 200, zeitraum);
			band.getRepertoire().add(song);

			System.out.println("+ " + song.toDetailString());

			kalender.set(1998, 2, 3);
			zeitraum = new ZeitAb(kalender.getTime());
			song = new Song("Basketcase", 195, zeitraum);
			band.getRepertoire().add(song);

			System.out.println("+ " + song.toDetailString());

		}
		System.out.println(band.getRepertoire());

		{
			Termin termin;

			kalender.set(2012, Calendar.OCTOBER, 11, 10, 15);
			zeitIntervall = new ZeitIntervall(kalender.getTime(), new Date());
			termin = new Probe("Zu Hause", zeitIntervall, 100);
			band.getTermine().add(termin);

			System.out.println("+ " + termin.toDetailString());

			kalender.set(2012, Calendar.OCTOBER, 10);
			zeitIntervall = new ZeitIntervall(kalender.getTime(), new Date());
			termin = new Auftritt("Ernst Happel Stadion", zeitIntervall, 100000);
			band.getTermine().add(termin);

			System.out.println("+ " + termin.toDetailString());
		}
		System.out.println(band.getTermine());

		kalender.set(2012, Calendar.OCTOBER, 11);
		System.out.println(band.getTermine(new ZeitAb(kalender.getTime())));
		System.out.println(band.getTermine(new ZeitAb(kalender.getTime())).getKosten());
	}
}
