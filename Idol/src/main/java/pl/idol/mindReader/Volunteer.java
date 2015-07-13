package pl.idol.mindReader;

public class Volunteer implements Thinker {
	
	private String thoughts;

	public void thingSomething(String thing) {
		this.thoughts = thing;

	}

	public String getThoughts() {
		return thoughts;
	}

	public void setThoughts(String thoughts) {
		this.thoughts = thoughts;
	}

}
