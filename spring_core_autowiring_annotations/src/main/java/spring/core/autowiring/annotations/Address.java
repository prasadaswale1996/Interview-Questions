package spring.core.autowiring.annotations;

public class Address {
	String city;
	int pin;
	
	
	public Address() {
		super();
//		no arg	
		}

	public Address(String city, int pin) {
		super();
		this.city = city;
		this.pin = pin;
	}
	
//	getter setter
	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

	@Override
	public String toString() {
		return "Address [city=" + city + ", pin=" + pin + "]";
	}
	
	
	
	
	
	
	
	
	
}
