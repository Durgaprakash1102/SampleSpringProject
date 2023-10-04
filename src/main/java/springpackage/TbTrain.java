package springpackage;

public class TbTrain implements Travel {
	 String name;
	

	public TbTrain() {
		super();
		System.out.println("TbTrain object created");
	}

	@Override
	public void journey() {
		System.out.println("Journey by Train takes 5 hrs");
		
	}

	@Override
	public void cost() {
		System.out.println("cost of travel by train is 600 /- rs");
	}

	@Override
	public void bookTickets() {
		System.out.println("Tickets for your destination are booked successfully through railways!!");		
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
		return "TbTrain [name=" + name + "]";
	}
	

}
