package pl.idol.performers;

import org.springframework.beans.factory.annotation.Autowired;

import pl.idol.madness.Madness;


public class MadMan implements Performer {
	
	@Autowired
	private Madness madness;
	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public MadMan(){}
	
	public MadMan(String name){
		this.name = name;
	}
	
	
	public void perform() {
		System.out.println("Jestem zajebisty i mam na imie " + name + " a teraz : ");
		for(int i = 0 ; i<100000 ; i++){
			Math.pow(2, 1234);
		}
		madness.showMAdnes();

	}

}
