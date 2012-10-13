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
	 * @param z Das ZeitIntervall das mit dem lokalen auf �berschneidung gepr�ft wird. Darf nicht null sein!
	 * @return True bei �berschneidung des Lokalen ZeitIntervalls mit dem in z, false wenn keine �berschneidung existiert.
	 */
	public boolean inZeitraum(Date z);
	
	/**
	 * 
	 * @param z Das ZeitIntervall das mit dem lokalen auf �berschneidung gepr�ft wird. 
	 * @return True bei �berschneidung des Lokalen ZeitIntervalls mit dem �bergebenen. False wenn keine �berschneidung existiert, d.h. wenn das lokale Intervall beginnt nachdem das �bergebene endet und vice versa.
	 */
	public boolean enthaelt(ZeitIntervall intervall);
	
	public String toString(DateFormat df);
}
