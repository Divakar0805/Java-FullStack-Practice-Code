package infosys;

public class Customer {

	String customerName;
	long contactNumber;
	String address;
	String customerId;

	public Customer(String customerName, long contactNumber, String address) {
		this.customerName = customerName;
		this.contactNumber = contactNumber;
		this.address = address;

	}

	public void displayCustomerDetails() {
		System.out.println("Display Customer Detailes : ");
		System.out.println("Customer Id : " + customerId);
		System.out.println("Customer Name: " + customerName);
		System.out.println("Contact Number: " + contactNumber);
		System.out.println("Address: " + address);
	}
}

// Tester class
class Test {
	public static void main(String[] args) {

		Customer customer = new Customer("Jacob", 5648394590L, "13th Street , New York");

		customer.displayCustomerDetails();
	}
}
