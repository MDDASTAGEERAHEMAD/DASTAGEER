package Comperator2;

public class Car {

	int cost;
	String brand;

	Car(int cost, String brand) {
		this.cost = cost;
		this.brand = brand;
	}

	@Override
	public String toString() {
		return brand + " " + cost;
	}

}
