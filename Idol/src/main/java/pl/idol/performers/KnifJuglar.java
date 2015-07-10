package pl.idol.performers;

import java.util.HashSet;
import java.util.Set;

import javax.inject.Inject;
import javax.inject.Provider;

import pl.idol.knif.Knif;
import pl.idol.knif.Scizors;

public class KnifJuglar implements Performer {

	private Set<Scizors> knif;
	
	@Inject
	public KnifJuglar(Provider<Scizors> knifProvider){
		knif = new HashSet<Scizors>();
		for(int i = 0 ; i<5 ; i++){
			knif.add(knifProvider.get());
		}
	}
	
	public void perform() {
		
		
		System.out.println("Żągluje nożami ");
		for(Knif k : knif){
	    	k.flight();
	    	System.out.println(k.hashCode());
	    	System.out.println("-------");
		}

	}

}
