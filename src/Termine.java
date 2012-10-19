import java.util.ArrayList;
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
	 * Gibt die Termine zurueck, die in dem ZeitIntervall
	 * <code>zeitIntervall</code> liegen.
	 * 
	 * @param zeitIntervall
	 * @return
	 */
	public Termine list(Zeitraum zeitraum) {
		Termine ausgabe = new Termine();

		for (Termin termin : this) {
			if (zeitraum.enthaelt(termin.getZeitIntervall())) {
				ausgabe.add(termin);
			}
		}

		return ausgabe;
	}

	/**
	 * Gibt alle Proben die in dem ZeitIntervall <code>zeitIntervall</code>
	 * liegen zurueck.
	 * 
	 * @param typ
	 * @param zeitIntervall
	 * @return
	 */
	public Termine listProben(Zeitraum zeitraum) {
		return list(Probe.class, zeitraum);
	}

	/**
	 * Gibt alle Auftritte die in dem ZeitIntervall <code>zeitIntervall</code>
	 * liegen zurueck.
	 * 
	 * @param typ
	 * @param zeitIntervall
	 * @return
	 */
	public Termine listAuftritte(Zeitraum zeitraum) {
		return list(Auftritt.class, zeitraum);
	}

	/**
	 * Gibt alle Termine des uebergebenen Typs <code>typ</code> die in dem
	 * ZeitIntervall <code>zeitIntervall</code> liegen zurueck.
	 * 
	 * @param typ
	 * @param zeitIntervall
	 * @return
	 */
	private Termine list(Class<? extends Termin> typ, Zeitraum zeitraum) {
		Termine liste = list(zeitraum);
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
	 * Berechnet den Gewinn aller Termine.
	 * 
	 * @param zeitpunkt
	 * @return der Gewinn
	 */
	public double getGewinn() {
		double gewinn = 0;

		for (Termin termin : this) {
			gewinn += termin.getGewinn();
		}

		return gewinn;
	}

	/**
	 * Berechnet die Kosten aller Termine.
	 * 
	 * @param zeitpunkt
	 * @return die Kosten
	 */
	public double getKosten() {
		double gewinn = 0;

		for (Termin termin : this) {
			gewinn += termin.getKosten();
		}

		return gewinn;
	}
}
