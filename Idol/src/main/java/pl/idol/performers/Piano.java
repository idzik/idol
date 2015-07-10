package pl.idol.performers;

import pl.idol.qualifier.Harmonica;
import pl.idol.qualifier.ImportantInstrument;

@Harmonica
@ImportantInstrument
public class Piano implements Instrument {

	public void play() {
		System.out.println("Pianino : bum lala bum lala");

	}

}
