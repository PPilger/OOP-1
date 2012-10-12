import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

/**
 * Eine Sammlung von Objekten die einen Zeitraum haben.
 * 
 * @author Peter Pilgerstorfer
 * 
 * @param <T>
 *            Der Typ der in der Collection gespeicherten Objekte.
 */
public abstract class HatZeitraumCollection<T extends HatZeitraum> {
	private Collection<T> elemente = new ArrayList<T>();

	public void add(T element) {
		elemente.add(element);
	}

	public void remove(T element) {
		elemente.remove(element);
	}

	/**
	 * Gibt die Elemente zurück, wo <code>zeitpunkt</code> in den Zeitraum
	 * fällt.
	 * 
	 * @param zeitpunkt
	 * @return
	 */
	public Collection<T> list(Date zeitpunkt) {
		Collection<T> liste = new ArrayList<T>();

		for (T element : elemente) {
			if (element.getZeitraum().inZeitraum(zeitpunkt)) {
				liste.add(element);
			}
		}

		return liste;
	}
}
