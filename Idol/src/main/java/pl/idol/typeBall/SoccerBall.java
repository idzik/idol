package pl.idol.typeBall;

public class SoccerBall implements Ball {
	
	private int sizeBall;
	private String shape;

	
	
	public SoccerBall(int sizeBall, String shape) {
		this.setSizeBall(sizeBall);
		this.setShape(shape);
	}



	public void fly() {
		System.out.println("Lecę nisko i szybko");
		
	}



	public String getShape() {
		return shape;
	}



	public void setShape(String shape) {
		this.shape = shape;
	}



	public int getSizeBall() {
		return sizeBall;
	}



	public void setSizeBall(int sizeBall) {
		this.sizeBall = sizeBall;
	}

}
