package springpackage;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {

	public static void main(String[] args) {
		ApplicationContext apcon = new ClassPathXmlApplicationContext("config.xml");
		MakeMyTrip m = apcon.getBean("mmt", MakeMyTrip.class);
		System.out.println(m.getTravel());
		System.out.println();
		
/*	TbBus tb=apcon.getBean("bus",TbBus.class);
	tb.trip();
	tb.bookTickets();
	tb.cost();
	tb.journey();
	System.out.println();
	
	TbTrain tt=apcon.getBean("train",TbTrain.class);
	tt.trip();
	tt.bookTickets();
	tt.cost();
	tt.journey();
	System.out.println();*/
	
	TbAirways ta=apcon.getBean("flight",TbAirways.class);
	ta.trip();
	ta.bookTickets();
	ta.cost();
	ta.journey();



	}}
