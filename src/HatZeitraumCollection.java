import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;

/**
 * Eine Sammlung von Objekten die einen Zeitraum haben.
 * 
 * @author Peter Pilgerstorfer
 * 
 * @param <T>
 *            Der Typ der in der Collection gespeicherten Objekte.
 */
public class HatZeitraumCollection<T extends HatZeitraum> {
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
	
	public String toString() {
		StringBuilder builder = new StringBuilder();
		
		Iterator<T> iter = elemente.iterator();
		if(iter.hasNext()) {
			builder.append(iter.next());
		}
		while(iter.hasNext()) {
			builder.append('\n');
			builder.append(iter.next());
		}
		
		return builder.toString();
	}
}
