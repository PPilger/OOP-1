import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * Eine Sammlung von Terminen.
 * 
 * @author Peter Pilgerstorfer
 * 
 */
public class Termine extends ArrayList<Termin> {

	/**
	 * Serialisierungs ID
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Gibt die Termine zurück, die in dem ZeitIntervall
	 * <code>zeitIntervall</code> liegen.
	 * 
	 * @param zeitIntervall
	 * @return
	 */
	public Collection<Termin> list(Zeitraum zeitraum) {
		Collection<Termin> ausgabe = new Termine();

		for (Termin termin : this) {
			if (zeitraum.enthaelt(termin.getZeitIntervall())) {
				ausgabe.add(termin);
			}
		}

		return ausgabe;
	}

	/**
	 * Gibt alle Termine des übergebenen Typs <code>typ</code>, in dem
	 * ZeitIntervall <code>zeitIntervall</code> liegen zurück.
	 * 
	 * @param typ
	 * @param zeitIntervall
	 * @return
	 */
	public Collection<Termin> list(Class<? extends Termin> typ,
			Zeitraum zeitraum) {
		Collection<Termin> liste = list(zeitraum);

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
	public double getGewinn(Class<? extends Termin> typ, Zeitraum zeitraum) {
		double gewinn = 0;

		for (Termin termin : list(typ, zeitraum)) {
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
	public double getKosten(Class<? extends Termin> typ, Zeitraum zeitraum) {
		double kosten = 0;

		for (Termin termin : list(typ, zeitraum)) {
			kosten += termin.getKosten();
		}

		return kosten;
	}
}
