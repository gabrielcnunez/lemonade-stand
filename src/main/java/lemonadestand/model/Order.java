package lemonadestand.model;

import java.util.Arrays;

public class Order {
	
	private Customer customer;
	
	private Lemonade[] lemonades;
	
	private double total;

	public Order(Customer customer) {
		super();
		this.customer = customer;
		lemonades = new Lemonade[0];
		total = 0.0;
	}
	
	public void addLemonade(Lemonade lemonade) {
		Lemonade[] newLemonadeArray = Arrays.copyOf(lemonades, lemonades.length + 1);
		newLemonadeArray[newLemonadeArray.length - 1] = lemonade;
		lemonades = newLemonadeArray;
		total += lemonade.getPrice();
	}

	public Customer getCustomer() {
		return customer;
	}

	public Lemonade[] getLemonades() {
		return lemonades;
	}

	public double getTotal() {
		return total;
	}
}