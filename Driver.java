/**
 *
 * @author Jonatas Natan Santos (https://github.com/JonatasNatan)
 */

public class Driver {
	private String name;
	private String licenseNumber;
	private int age;

	// Constructor
	public Driver(String name, String licenseNumber, int age) {
		this.name = name;
		this.licenseNumber = licenseNumber;
		this.age = age;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLicenseNumber() {
		return this.licenseNumber;
	}

	public void setLicenseNumber(String licenseNumber) {
		this.licenseNumber = licenseNumber;
	}

	public int getAge() {
		return this.age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}