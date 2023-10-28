/**
 *
 * @author Jonatas Natan Santos (https://github.com/JonatasNatan)
 */

public class Bus {
	private int numberBus;
	private int capacity;
	private String route;
	private Driver driver;

	// Constructor
	public Bus(int numberBus, String route, int capacity, Driver driver) {
		this.numberBus = numberBus;
		this.capacity = capacity;
		this.route = route;
		this.driver = driver;
	}

	public int getNumberBus() {
		return this.numberBus;
	}

	public void setNumberBus(int numberBus) {
		this.numberBus = numberBus;
	}

	public int getCapacity() {
		return this.capacity;
	}
	
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public String getRoute() {
		return this.route;
	}

	public void setRoute(String route) {
		this.route = route;
	}

	public Driver getDriver() {
		return this.driver;
	}

	public void setDriver(Driver driver) {
		this.driver = driver;
	}

	@Override
	public String toString() {
		return " Informações do ônibus {" + "\n Número do Ônibus: " + this.getNumberBus() + 
							 "\n Trajeto: " + this.getRoute() + "\n Capacidade Máxima: " + this.getCapacity() +
							 " Passageiros" + "\n Motorista: " + this.getDriver().getName() + 
								"\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-= \n" + '}';
		}
}