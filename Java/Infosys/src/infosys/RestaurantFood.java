package infosys;

public class RestaurantFood {
    String foodName;
    String cuisine;
    String foodType;
    int quantityAvailable;
    double unitPrice;

    public static void main(String[] args) {

        RestaurantFood food1 = new RestaurantFood();

        food1.foodName = "Pizza";
        food1.cuisine = "Italian";
        food1.foodType = "Veg";
        food1.quantityAvailable = 10;
        food1.unitPrice = 250.5;

        System.out.println("Food Name: " + food1.foodName);
        System.out.println("Cuisine: " + food1.cuisine);
        System.out.println("Food Type: " + food1.foodType);
        System.out.println("Quantity: " + food1.quantityAvailable);
        System.out.println("Price: " + food1.unitPrice);
    }
}