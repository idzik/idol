package pl.idol.performers;

import org.springframework.beans.factory.annotation.Autowired;

import pl.idol.poemat.*;



public class PoeticJugglar extends Juggler {
	
	@Autowired
	private Poemat poem;

	public PoeticJugglar() {}
	
	public PoeticJugglar(Poemat poem){
		super();
		this.poem = poem;
	}
	
	public PoeticJugglar(int quantitiBags , Poemat poem){
		super(quantitiBags);
		this.poem = poem;
		
	}
	
	public void turnOnLight(){
		System.out.println("ide do łazienki bo sie stresuje");
	}
	
	public void perform(){
//		super.perform();
		System.out.println(" do tego recytuje poemat : "); 
		poem.poem();
		
	}
}
