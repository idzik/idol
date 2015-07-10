package pl.idol.performers;

import java.util.Collection;
import java.util.Map;

public class Juggler implements Performer{
	
	private int quantityBags = 3;
	private Collection<Instrument> instrument;
	private Map<String, Instrument> map;
	
	public Juggler( ) {}
	
	public Juggler(int quantityBags) {
		this.quantityBags = quantityBags;
	}


	public Juggler(int quantityBags , Collection<Instrument> instrument, Map<String, Instrument> map) {
		this.quantityBags = quantityBags;
		this.instrument = instrument;
		this.map = map;
		
	}


	
	public void perform() {
		System.out.println("Żągluję "+quantityBags+" woreczkami z grochem dla zabawy gram na");
		for(Instrument i : instrument){
			i.play();
		}
		
		for(String k : map.keySet()){
			System.out.println(k + " ");
			map.get(k).play();
		}
		
	}

}
