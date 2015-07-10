package pl.idol.performers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import pl.idol.spall.ImportantSpall;
import pl.idol.spall.Spall;

@Component
public class Magic implements Performer {
	
	@Autowired
	@ImportantSpall
	private Spall spall ;

	public void perform() {
		System.out.println("Wyczaruje dla Panstwa");
		spall.castSpall();

	}

}
