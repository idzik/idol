package pl.idol.audience;

import org.aspectj.lang.ProceedingJoinPoint;

public class Audience {

	public void teakeSeats() {
		System.out.println("Widownia zajmuje miejsca");
	}

	public void turnOffTelephone() {
		System.out.println("Wyłączone zostają wszystkie telefony");
	}

	public void applause() {
		System.out.println("Bravoooo Bravooooo !!!!!!");
	}

	public void buuuu() {
		System.out.println("BUUUUUUUUUUUUUUUUUUUUU !!!!!!!");
	}

	public void watchPerformers(ProceedingJoinPoint joinPoint) {

		try {
			System.out.println("Siadać");
			System.out.println("Telefony wyłączyć");

			long start = System.currentTimeMillis();
			System.out.println("Rozpoczęcie " + start);

			joinPoint.proceed();
			
			long end = System.currentTimeMillis();
			System.out.println("Zakończenie " + end);
			System.out.println("Oklaski za wspaniały występ");
			System.out.println("Występ trwał " + (end-start) + " milisekund");

		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
