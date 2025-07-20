public interface CartService {
    Cart createCart(User user);
    void addProduct(Cart cart, Product product);
    void removeProduct(Cart cart, Product product);
}
