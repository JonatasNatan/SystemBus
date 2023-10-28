public class Main {
  public static void main(String[] args) {
		RegistrationBus busesAvailable = new RegistrationBus();

		RegistrationTravel travelAvailable = new RegistrationTravel();

		Driver driver00 = new Driver("Jonatas", "09723452324", 30);
		Driver driver01 = new Driver("José", "09723452324", 40);
		Driver driver02 = new Driver("João", "09723452324", 20);

		Bus bus00 = new Bus(01, "Guarabira - JoãoPessoa - Guarabira", 22, driver00);
		Bus bus01 = new Bus(02, "JoãoPessoa - Guarabira - JoãoPessoa", 22, driver01);
		Bus bus02 = new Bus(03, "JoãoPessoa - CampinaGrande - JoãoPessoa", 18, driver02);

		busesAvailable.addNewBus(bus00);
		busesAvailable.addNewBus(bus01);
		busesAvailable.addNewBus(bus02);

		busesAvailable.printAllBuses();

		Passenger passenger00 = new Passenger("Jonatas", "09-723.452.324", 20);
		Passenger passenger01 = new Passenger("José", "09-721.863.873", 30);
		Passenger passenger02 = new Passenger("João", "08-927.872.313", 18);

		Travel travel00 = new Travel("Guarabira", "Santa Rita", driver00, passenger00, 12.00, false);
		Travel travel01 = new Travel("JoãoPessoa", "CampinaGrande", driver01, passenger01, 20.50, false);
		Travel travel02 = new Travel("JoãoPessoa", "Guarabira", driver02, passenger02, 20.50, true);

		travelAvailable.addTravel(travel00);
		travelAvailable.addTravel(travel01);
		travelAvailable.addTravel(travel02);

	 	travelAvailable.printAllTravels();
  
  }
}