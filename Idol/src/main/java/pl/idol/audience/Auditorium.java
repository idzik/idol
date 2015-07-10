package pl.idol.audience;

/*import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;*/


public class Auditorium /* implements InitializingBean , DisposableBean*/{

	 public void turnOnLight(){
	 System.out.println("Włączam światło");
	 }
	
	 public void turnOffLoght(){
	 System.out.println("Światło wyłączone");
	 }

/*	@Override
	public void destroy() throws Exception {
		System.out.println("Nastsje ciemność");
		
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Nowe swiatło zalewa aule");
		
	}*/

/*	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Włączam światło");

	}

	@Override
	public void destroy() throws Exception {
		System.out.println("Światło wyłączone");

	}*/
}
