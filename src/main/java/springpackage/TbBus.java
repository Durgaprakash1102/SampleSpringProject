package springpackage;

public class TbBus implements Travel {
	
	String name;

	public TbBus() {
		super();
		System.out.println("TbBus object created");
	}
	

	@Override
	public void journey() {
		System.out.println("Journey by Bus takes 6 hrs");
	}

	@Override
	public void cost() {
		System.out.println("cost of travel by bus is 1000 /- rs");
		
	}

	@Override
	public void bookTickets() {
		System.out.println("Tickets for your destination are booked successfully through roadways!!");
		
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
		return "TbBus [name=" + name + "]";
	}
	
	
	

}
