package pl.idol.mindReader;

public class GuessThoughts implements MindReader {
	
	private String thoughts;

	public void interceotThoughts(String thoughts) {
		System.out.println("Potrzebuję myślciela");
		this.thoughts = thoughts;

	}

	public String getThoughts() {
		return thoughts;
	}

	
	public void setThoughts(String thoughts) {
		this.thoughts = thoughts;
	}
	
	

}
