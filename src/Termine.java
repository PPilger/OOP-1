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
	 * Serialisierungs ID
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Gibt alle Termine des übergebenen Typs <code>typ</code>, die zum
	 * Zeitpunkt <code>zeitpunkt</code> gültig sind zurück.
	 * 
	 * @param typ
	 * @param zeitpunkt
	 * @return
	 */
	public Collection<Termin> list(Class<? extends Termin> typ, Date zeitpunkt) {
		Collection<Termin> liste = list(zeitpunkt);

		Iterator<Termin> iter = liste.iterator();
		while (iter.hasNext()) {
			Termin termin = iter.next();
			if (!termin.getClass().equals(typ)) {
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
	public double getGewinn(Class<? extends Termin> typ, Date zeitpunkt) {
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
	public double getKosten(Class<? extends Termin> typ, Date zeitpunkt) {
		double kosten = 0;

		for (Termin termin : list(typ, zeitpunkt)) {
			kosten += termin.getKosten();
		}

		return kosten;
	}
}
