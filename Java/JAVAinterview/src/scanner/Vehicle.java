package scanner;

public class Vehicle {

	public void start() {
		System.out.println("Vehicle Started");
	}
	
	//Overloaded
	public void start(String keyType) {
		System.out.println("Vehicle is Getting Started With :"+keyType);
	}
	
	public void stop() {
		System.out.println("Vehicle Stops");
	}
	
}
class Bike extends Vehicle{
	@Override
	public void start() {
		System.out.println("Bike Starts");
	}
}

class Car extends Vehicle{
	@Override
	public void start() {
		System.out.println("Car Starts");
	}
}
class Bus extends Vehicle{
	@Override
	public void start() {
		System.out.println("Bus Starts");
	}
}