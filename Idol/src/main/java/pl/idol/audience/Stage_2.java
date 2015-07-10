package pl.idol.audience;

public class Stage_2 {
	
	private Stage_2(){}
	
	 public void turnOnLight(){
	 System.out.println("Włączam światło na scenie");
	 }
	
	 public void turnOffLoght(){
	 System.out.println("Światło wyłączone ze sceny");
	 }
	
	private static class StaticStage_2{
		static Stage_2 in = new Stage_2();
	}

	public static Stage_2 getInstance(){
		return StaticStage_2.in;
	}
}
