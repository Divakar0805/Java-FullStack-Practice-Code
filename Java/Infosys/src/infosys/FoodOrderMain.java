package infosys;

public class FoodOrderMain {
    public static void main(String[] args) {

        Food f1 = new Food("Pizza", 250);
        Order o1 = new Order(101, f1);

        System.out.println("Order ID: " + o1.getOrderId());
        System.out.println("Food Name: " + o1.getFood().getName());
        System.out.println("Food Price: " + o1.getFood().getPrice());

        o1.getFood().setPrice(300);
        o1.setOrderId(102);

        System.out.println("\nAfter Update:");

        System.out.println("Order ID: " + o1.getOrderId());
        System.out.println("Food Name: " + o1.getFood().getName());
        System.out.println("Food Price: " + o1.getFood().getPrice());
    }
}
