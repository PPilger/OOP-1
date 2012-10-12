import java.util.Calendar;
import java.util.Date;


public class Test {
	public static void main(String[] args) {
		Calendar kalender = Calendar.getInstance();
		Zeitraum zeitraum;
		Mitglied mitglied;
		
		Band band = new Band("Green Day", "Rock");
		
		kalender.set(1987, 7, 5);
		zeitraum = new ZeitAb(kalender.getTime());
		mitglied = new Mitglied("Billie Joe Armstrong", "31/2345", "Gitarre", zeitraum);
		band.getMitglieder().add(mitglied);

		kalender.set(1987, 6, 4);
		zeitraum = new ZeitAb(kalender.getTime());
		mitglied = new Mitglied("Mike Dirnt", "3123/2215", "Bass", zeitraum);
		band.getMitglieder().add(mitglied);
		
		System.out.println(band.getMitglieder());

		kalender.set(1990, 1, 1);
		zeitraum = new ZeitIntervall(kalender.getTime(), new Date());
		band.getRepertoire().add(new Song("Holiday", 200, zeitraum));
		
		kalender.set(1998, 2, 3);
		zeitraum = new ZeitIntervall(kalender.getTime(), new Date());
		band.getRepertoire().add(new Song("Basketcase", 195, zeitraum));

		System.out.println(band.getRepertoire());

		kalender.set(2012, 10, 11);
		zeitraum = new ZeitIntervall(kalender.getTime(), new Date());
		band.getTermine().add(new Probe("Zu Hause", zeitraum, 100));
		
		kalender.set(2012, 10, 10);
		zeitraum = new ZeitIntervall(kalender.getTime(), new Date());
		band.getTermine().add(new Auftritt("Ernst Happel Stadion", zeitraum, 100000));

		System.out.println(band.getTermine());
	}
}
