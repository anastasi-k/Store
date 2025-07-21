public interface OrderService {
    Order checkout(Cart cart);
    void updateOrderStatus(Order order, OrderStatus status);
}
