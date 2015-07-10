package pl.idol.performers;

import java.util.List;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Value;

import pl.idol.qualifier.Harmonica;
import pl.idol.qualifier.ImportantInstrument;


public class Instrumentalist implements Performer {
	
	private List<String> song;
	@Inject
	@Harmonica
	@ImportantInstrument
	private Instrument instrument;
	@Value("3333")
	private int age;
	


	public Instrumentalist() {}

	public void perform() {
		System.out.println("Witam. Mam " + age + " lat i " + " gram " + song);
		instrument.play();
		
	}



	public List<String> getSong() {
		return song;
	}

	public void setSong(List<String> song) {
		this.song = song;
	}
	
	public Instrument getInstrument() {
		return instrument;
	}
	public void setInstrument(Instrument instrument) {
		this.instrument = instrument;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}


}
