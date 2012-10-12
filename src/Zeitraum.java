import java.text.DateFormat;
import java.util.Date;

/**
 * Erm�glicht die �berpr�fung ob sich Zeitr�ume �berschneiden.
 * @author K�gler Alexander
 *
 */
public interface Zeitraum {

	/**
	 * 
	 * @param z Das ZeitIntervall das mit dem lokalen auf �berschneidung gepr�ft wird. 
	 * @return True bei �berschneidung des Lokalen ZeitIntervalls mit dem in z, false wenn keine �berschneidung existiert oder z null ist.
	 */
	public boolean inZeitraum(Date z);
	
	public String toString(DateFormat df);
}
