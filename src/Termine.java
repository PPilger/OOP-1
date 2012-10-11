import java.util.Collection;
import java.util.Iterator;


//TODO: Object -> Termin
public class Termine extends HatZeitraumCollection<Object> {

	public Collection<Object> list(String typ, long zeitpunkt) {
		Collection<Object> liste = list(zeitpunkt);
		
		if("alle".equals(typ.toLowerCase())) {
			return liste;
		}
		
		Iterator<Object> iter = liste.iterator();
		while(iter.hasNext()) {
			Object termin = iter.next();
			//TODO: if(...) -> Abfrage, ob typ mit termin.getTyp() übereinstimmt
			if(termin.getClass() == Object.class) {
				iter.remove();
			}
		}
		
		return liste;
	}
	
	public double getGewinn(String typ, long zeitpunkt) {
		double gewinn = 0;
		
		for(Object termin : list(typ, zeitpunkt)) {
			gewinn += termin.hashCode(); //TODO: termin.getGewinn();
		}
		
		return gewinn;
	}
	
	public double getKosten(String typ, long zeitpunkt) {
		double kosten = 0;
		
		for(Object termin : list(typ, zeitpunkt)) {
			kosten += termin.hashCode(); //TODO: termin.getKosten();
		}
		
		return kosten;
	}
}
