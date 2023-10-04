package springpackage;

public class MakeMyTrip {
	Travel travel;

	public MakeMyTrip() {
		super();
    System.out.println("MakeMyTrip object created");
	}

	public Travel getTravel() {
		return travel;
	}

	public void setTravel(Travel travel) {
		this.travel = travel;
	}

	@Override
	public String toString() {
		return "MakeMyTrip [travel=" + travel + ", getTravel()=" + getTravel() + "]";
	}

	
	

}
