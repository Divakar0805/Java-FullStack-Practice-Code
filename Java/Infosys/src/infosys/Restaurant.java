package infosys;

public class Restaurant {

    String restaurantName;
    long restaurantContact;
    String restaurantAddress;
    float rating;

    public void displayRestaurantDetails() {
        System.out.println("Restaurant Details");
        System.out.println("******************");
        System.out.println("Restaurant Name : " + restaurantName);
        System.out.println("Restaurant Rating : " + rating);
        System.out.println("Restaurant Contact : " + restaurantContact);
        System.out.println("Restaurant Address : " + restaurantAddress);
    }
}


