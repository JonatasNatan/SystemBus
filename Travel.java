public class Travel {
	private String origin;
	private String destination;
	private boolean moving;
	private Driver driver;
	private double ticketValue;
	private Passenger passenger;
	private boolean halfPass;

	// Constructor
	public Travel(String origin, String destination, Driver driver,Passenger passenger, double ticketValue, boolean halfPass) {
		this.origin = origin;
		this.destination = destination;
		this.driver = driver;
		this.ticketValue = ticketValue;
		this.passenger = passenger;
		this.halfPass = halfPass;
	}
	
	// Getters and Setters
	public String getOrigin() {
		return this.origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}
	
	public String getDestination() {
		return this.destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public boolean isMoving() {
		return this.moving;
	}

	public void setMoving(boolean moving) {
		this.moving = moving;
	}

	public Driver getDriver() {
		return this.driver;
	}

	public void setDriver(Driver driver) {
		this.driver = driver;
	}

	public double getTicketValue() {
		return this.ticketValue;
	}

	public void setTicketValue(double ticketValue) {
		this.ticketValue = ticketValue;
	}

	public Passenger getPassenger() {
		return this.passenger;
	}

	public void setPassenger(Passenger passenger) {
		this.passenger = passenger;
	}

	public boolean isHalfPass() {
		return this.halfPass;
	}

	public void setHalfPass(boolean halfPass) {
	 	this.halfPass = halfPass;
	}

	// toString()
	@Override
	public String toString() {
		return "Viagem{" + "\n Origem : " + origin + "\n Destino: " + destination + "\n Em Deslocamento: " + this.isMoving() +
		"\n Motorista: " + this.getDriver().getName() + "\n Valor da Passagem: " + this.getTicketValue() 
		+ "\n Passageiro: " + this.passenger.getName() + "\n =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=" + '}';
	}
}