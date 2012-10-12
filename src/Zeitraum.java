/**
 * Ermöglicht die Überprüfung ob sich Zeiträume überschneiden.
 * @author Kögler Alexander
 *
 */
public interface Zeitraum {

	/**
	 * 
	 * @param z Das ZeitIntervall das mit dem lokalen auf Überschneidung geprüft wird. 
	 * @return True bei überschneidung des Lokalen ZeitIntervalls mit dem in z, false wenn keine Überschneidung existiert oder z null ist.
	 */
	public boolean inZeitraum(ZeitIntervall z);
}
