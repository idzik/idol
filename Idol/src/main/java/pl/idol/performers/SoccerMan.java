package pl.idol.performers;

import pl.idol.typeBall.*;

public class SoccerMan implements Performer {
	
	private int bounceBall;
	private Ball soccerBall;
	
	public SoccerMan(){}
	
	public SoccerMan( int bounceBall, Ball soccerBall){
		this.bounceBall = bounceBall;
		this.soccerBall = soccerBall;
	}

	public int getBounceBall() {
		return bounceBall;
	}

	public void setBounceBall(int bounceBall) {
		this.bounceBall = bounceBall;
	}

	public Ball getSoccerBall() {
		return soccerBall;
	}

	public void setSoccerBall(Ball ball) {
		this.soccerBall = ball;
	}


	public void perform() {
		System.out.println("Drybluje " + bounceBall + " rodzajem piłki");
		soccerBall.fly();

	}

}
