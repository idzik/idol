package pl.idol.audience;

public class Stage {

	private Stage(){}
	
	private static class StageSingeltonHoldem{
		static Stage instance = new Stage();
	}
	
	public static Stage getInstance(){
		return StageSingeltonHoldem.instance;
	}
}
