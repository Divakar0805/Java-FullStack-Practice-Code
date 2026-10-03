package has;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("c")
public class Car {
	@Value("TN20cd7324")
	private String no;
	@Value("Hyundai")
	private String brand;
	@Value("Crita")
	private String model;
	@Value("2000000")
	private double price;
	@Autowired
	private Engine engine;
	@Override
	public String toString() {
		return "Car [no=" + no + ", brand=" + brand + ", model=" + model + ", price=" + price + ", engine=" + engine
				+ "]";
	}
	
}
