public class Order {
    private final Cart cart;
    private OrderStatus status;

    public Order(Cart cart) {
        this.cart = cart;
    }
}
