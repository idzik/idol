package pl.idol.com.spring.idol;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pl.idol.performers.*;

public class IdolApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("idol_spring.xml");
//		Performer pr = (Performer)context.getBean("duke");
////		Performer keny = (Instrumentalist)context.getBean("keny");
//		Performer sax = (Instrumentalist)context.getBean("saxofonist");
////		Performer hunk = (OnManBand)context.getBean("hunk");
////		Performer citko = (SoccerMan)context.getBean("citko");
//		Performer du = (Performer) context.getBean("du");
		
		Performer gr = (Performer) context.getBean("grajek");
		Performer poe = (Performer) context.getBean("poetic");
		Performer danc = (Performer)context.getBean("dancer");
		Performer noz = (Performer)context.getBean("noz");
		Performer mag = (Performer)context.getBean("magic");
		Performer madman = (Performer)context.getBean("madMan");
		
		
		poe.perform();
		System.out.println("-------");
    	gr.perform();
		System.out.println("-------");
    	danc.perform();
		System.out.println("-------");
    	noz.perform();
		System.out.println("-------");
    	mag.perform();
		System.out.println("-------");
    	madman.perform();
//		pr.perform();
//		System.out.println("-------");
////		keny.perform();
////		System.out.println("-------");
//		sax.perform();
//		System.out.println("-------");
////		hunk.perform();
////		System.out.println("-------");
////		citko.perform();
//
//		du.perform();
		
		((ConfigurableApplicationContext)context).close();
	}

}
