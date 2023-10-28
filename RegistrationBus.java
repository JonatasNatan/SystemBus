import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jonatas Natan Santos (https://github.com/JonatasNatan)
 */
public class RegistrationBus {
	private List<Bus> busesAvailable;

	// Constructor
	public RegistrationBus() {
		this.busesAvailable = new ArrayList<Bus>();
	}

	public void addNewBus(Bus newBus){
		this.busesAvailable.add(newBus);
	}

	public void printAllBuses(){
		for (Bus index : this.busesAvailable) {
			System.out.println(index.toString());
		}
	}
}