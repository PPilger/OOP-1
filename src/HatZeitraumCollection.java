import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

/**
 * Eine Sammlung von Objekten die einen Zeitraum haben.
 * 
 * @author Peter Pilgerstorfer
 * 
 * @param <T>
 *            Der Typ der in der Sammlung gespeicherten Objekte.
 */
public class HatZeitraumCollection<T extends HatZeitraum> extends ArrayList<T> {
	/**
	 * Serialisierungs ID
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Gibt die Elemente zurück, wo <code>zeitpunkt</code> in den Zeitraum
	 * fällt.
	 * 
	 * @param zeitpunkt
	 * @return
	 */
	public Collection<T> list(Date zeitpunkt) {
		Collection<T> ausgabe = new HatZeitraumCollection<T>();

		for (T element : this) {
			if (element.getZeitraum().inZeitraum(zeitpunkt)) {
				ausgabe.add(element);
			}
		}

		return ausgabe;
	}
}
