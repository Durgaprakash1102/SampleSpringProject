package springpackage;

public class TbAirways implements Travel {
	String name;
	

	public TbAirways() {
		super();
		System.out.println("TbAirways object created");
	}

	@Override
	public void journey() {
		System.out.println("Journey by Train takes 2 hrs");
	}

	@Override
	public void cost() {
		System.out.println("cost of travel by Airways is 5000/- rs");
		
	}

	@Override
	public void bookTickets() {
		System.out.println("Tickets for your destination are booked successfully through Airways !!");
		
	}

	@Override
	public void trip() {
		System.out.println("Your trip for vizag is planned properly by our team");
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "TbAirways [name=" + name + "]";
	}
	

}
