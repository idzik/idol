package pl.idol.performers;

import javax.inject.Inject;

import pl.idol.dance.Dance;
import pl.idol.qualifier.DanceQualifier;


public class Tancerz implements Performer {

	@Inject
	@DanceQualifier
	private Dance dance;
	

	public void perform() {
		System.out.println("Tańcze ");
		dance.move();

	}

}
