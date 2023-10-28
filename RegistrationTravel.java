import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jonatas Natan Santos (https://github.com/JonatasNatan)
 */
public class RegistrationTravel {
	private List<Travel> totalTrips;
	private int totalPassenger;
	private double totalRaised;

	// Constructor
	public RegistrationTravel() {
		this.totalTrips = new ArrayList<Travel>();
		this.totalPassenger = 0;
	}

	public void addTravel(Travel newTravel) {
		this.totalTrips.add(newTravel);
	}

	public List<Travel> getTotalTrips() {
		return this.totalTrips;
	}

	public void setTotalTrips(List<Travel> totalTrips) {
		this.totalTrips = totalTrips;
	}

	public double getTotalRaised() {
		return this.totalRaised;
	}

	public void setTotalRaised(double totalRaised) {
		this.totalRaised = totalRaised;
	}

	public int getTotalPassenger() {
		return this.totalPassenger;
	}

	public void setTotalPassenger(int totalPassenger) {
		this.totalPassenger = totalPassenger;
	}

	public double calculateRevenue() {
		for (Travel index : this.totalTrips) {
			this.setTotalRaised(index.getTicketValue() + this.getTotalPassenger());
		}
		return this.getTotalRaised();
	}

	public void printAllTravels() {
		for (Travel index : this.totalTrips) {
			System.out.println(index.toString());
		}

		System.out.println("Total Arrecadado: R$ " + this.calculateRevenue());

	}
}