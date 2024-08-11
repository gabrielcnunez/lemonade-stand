package lemonadestand.model;

public class Customer {
	
	private String name;
	
	private String phoneNumber;
	
	public Customer(String name, String phoneNumber) {
		super();
		this.name = name;
		this.phoneNumber = phoneNumber;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public String getName() {
		return name;
	}

}