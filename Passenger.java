public class Passenger {
	private String name;
	private String identityRegistration;
	private int age;

	// Constructor
	public Passenger(String name, String identityRegistration, int age) {
		this.name = name;
		this.identityRegistration = identityRegistration;
		this.age = age;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIdentityRegistration() {
		return this.identityRegistration;
	}

	public void setIdentityRegistration(String identityRegistration) {
		this.identityRegistration = identityRegistration;
	}

	public int getAge() {
		return this.age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}