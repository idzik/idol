package pl.idol.testConfiguration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import pl.idol.madness.BreakHand;
import pl.idol.madness.Madness;
import pl.idol.performers.MadMan;
import pl.idol.performers.Performer;

@Configuration
public class ConfigurationTest {
	
	@Bean
	public Madness breakHand(){
		return new BreakHand();
	}

	@Bean
	public Performer madMan(){		
//		MadMan mad = new MadMan();
//		mad.setName("Bronisław");		
		return new MadMan("Roman");
	}
		
		
}
