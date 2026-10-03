package infosys;

public class Order {
    private int orderId;
    private Food food;

    public Order(int orderId, Food food) {
        this.orderId = orderId;
        this.food = food;
    }

    public int getOrderId() {
        return orderId;
    }

    public Food getFood() {
        return food;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public void setFood(Food food) {
        this.food = food;
    }
}
