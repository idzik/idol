package pl.idol.performers;

import java.util.Collection;
import java.util.Map;

public class OnManBand implements Performer {
	
	private Collection<Instrument> instrument;
	private Map<String, Instrument> mapInstrument;

	public void perform() {
		for(Instrument in : instrument){
			in.play();
		}
		
		System.out.println("A teraz mapa");
		
		for(String key : mapInstrument.keySet()){
			mapInstrument.get(key).play();
		}

	}

	public Map<String, Instrument> getMapInstrument() {
		return mapInstrument;
	}

	public void setMapInstrument(Map<String, Instrument> mapInstrument) {
		this.mapInstrument = mapInstrument;
	}

	public Collection<Instrument> getInstrument() {
		return instrument;
	}

	public void setInstrument(Collection<Instrument> instrument) {
		this.instrument = instrument;
	}

}
