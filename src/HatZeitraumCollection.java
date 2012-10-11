import java.util.ArrayList;
import java.util.Collection;


//TODO: T extends HatZeitraum
/**
 * Eine Sammlung von Objekten die einen Zeitraum haben.
 * 
 * @author Peter Pilgerstorfer
 *
 * @param <T>
 */
public abstract class HatZeitraumCollection<T> {
	private Collection<T> elemente = new ArrayList<T>();

	public void add(T element) {
		elemente.add(element);
	}
	
	public void remove(T element) {
		elemente.remove(element);
	}

	/**
	 * Gibt die Elemente zurueck, wo <code>zeitpunkt</code> in den Zeitraum faellt.
	 * @param zeitpunkt
	 * @return
	 */
	public Collection<T> list(long zeitpunkt) {
		Collection<T> liste = new ArrayList<T>(elemente);
		//TODO
		return liste;
	}
}
