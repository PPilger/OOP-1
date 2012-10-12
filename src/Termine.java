import java.util.Collection;
import java.util.Date;
import java.util.Iterator;

/**
 * Eine Sammlung von Terminen.
 * 
 * @author Peter Pilgerstorfer
 * 
 */
public class Termine extends HatZeitraumCollection<Termin> {

	/**
	 * Gibt alle Termine des übergebenen Typs <code>typ</code>, die zum
	 * Zeitpunkt <code>zeitpunkt</code> gültig sind zurück.
	 * 
	 * @param typ
	 * @param zeitpunkt
	 * @return
	 */
	public Collection<Termin> list(String typ, Date zeitpunkt) {
		Collection<Termin> liste = list(zeitpunkt);

		if ("alle".equals(typ.toLowerCase())) {
			return liste;
		}

		Iterator<Termin> iter = liste.iterator();
		while (iter.hasNext()) {
			Object termin = iter.next();
			// TODO: if(...) -> Abfrage, ob typ mit termin.getTyp()
			// übereinstimmt
			if (termin.getClass() == Object.class) {
				iter.remove();
			}
		}

		return liste;
	}

	/**
	 * Gibt den Gewinn aller Termine des übergebenen Typs <code>typ</code>, die
	 * zum Zeitpunkt <code>zeitpunkt</code> gültig sind zurück.
	 * 
	 * @param typ
	 * @param zeitpunkt
	 * @return
	 */
	public double getGewinn(String typ, Date zeitpunkt) {
		double gewinn = 0;

		for (Termin termin : list(typ, zeitpunkt)) {
			gewinn += termin.getGewinn();
		}

		return gewinn;
	}

	/**
	 * Gibt die Kosten aller Termine des übergebenen Typs <code>typ</code>, die
	 * zum Zeitpunkt <code>zeitpunkt</code> gültig sind zurück.
	 * 
	 * @param typ
	 * @param zeitpunkt
	 * @return
	 */
	public double getKosten(String typ, Date zeitpunkt) {
		double kosten = 0;

		for (Termin termin : list(typ, zeitpunkt)) {
			kosten += termin.getKosten();
		}

		return kosten;
	}
}
