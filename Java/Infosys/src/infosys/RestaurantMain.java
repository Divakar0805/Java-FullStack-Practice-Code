package infosys;

public class RestaurantMain {
    public static void main(String[] args) {

        Restaurant r = new Restaurant();

        r.restaurantName = "McDonald's";
        r.rating = 4.1f;
        r.restaurantContact = 9988676767L;
        r.restaurantAddress = "SH1109, Carolina Street, Springfield";

        r.displayRestaurantDetails();
    }
}