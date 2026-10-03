package scanner;

public class VehicleFactory {

	public static void main(String[] args) {
		Vehicle v1=new Car();
		Vehicle v2=new Bike();
		Vehicle v3=new Bus();
		v1.start();
		v2.start();
		v3.start("Remote Key");
	}
}
/*
 * Car Starts
Bike Starts
Vehicle is Getting Started With :Remote Key
*/
