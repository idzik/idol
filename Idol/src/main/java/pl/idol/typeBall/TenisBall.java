package pl.idol.typeBall;

public class TenisBall extends SoccerBall implements Ball {

	private String color;
	
	public TenisBall(int sizeBall, String shape, String color) {
		super(sizeBall, shape);
		this.setColor(color);
		
	}

	@Override
	public void fly() {
		System.out.println("Very fast ");

	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

}
