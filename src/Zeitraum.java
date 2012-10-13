import java.text.DateFormat;
import java.util.Date;

/**
 * Ermöglicht die Überprüfung ob sich Zeiträume überschneiden.
 * @author Kögler Alexander
 *
 */
public interface Zeitraum {

	/**
	 * 
	 * @param z Das ZeitIntervall das mit dem lokalen auf Überschneidung geprüft wird. Darf nicht null sein!
	 * @return True bei überschneidung des Lokalen ZeitIntervalls mit dem in z, false wenn keine Überschneidung existiert.
	 */
	public boolean inZeitraum(Date z);
	
	/**
	 * 
	 * @param z Das ZeitIntervall das mit dem lokalen auf Überschneidung geprüft wird. 
	 * @return True bei überschneidung des Lokalen ZeitIntervalls mit dem übergebenen. False wenn keine Überschneidung existiert, d.h. wenn das lokale Intervall beginnt nachdem das übergebene endet und vice versa.
	 */
	public boolean enthaelt(ZeitIntervall intervall);
	
	public String toString(DateFormat df);
}
