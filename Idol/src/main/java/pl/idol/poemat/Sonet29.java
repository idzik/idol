package pl.idol.poemat;

public class Sonet29 implements Poemat {
	
	private String[] sonet = {"Treść sonetu 29 autorstwa Szekspira"};
	
	public Sonet29(){}
	
	public void poem() {
		for(int i = 0 ; i< sonet.length ; i++)
			System.out.println(sonet[i]);

	}

}
