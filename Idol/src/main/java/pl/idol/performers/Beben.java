package pl.idol.performers;

import org.springframework.stereotype.Component;


@Component
public class Beben implements Instrument {


	public void play() {
		System.out.println("Buuuummmmmmm Bum Bummm");

	}

}
