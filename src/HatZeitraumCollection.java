import java.util.ArrayList;
import java.util.Collection;


//TODO: T extends HatZeitraum
public abstract class HatZeitraumCollection<T> {
	private Collection<T> elemente = new ArrayList<T>();

	public void add(T element) {
		elemente.add(element);
	}
	
	public void remove(T element) {
		elemente.remove(element);
	}

	public Collection<T> list(long zeitpunkt) {
		//TODO
		return null;
	}
}
