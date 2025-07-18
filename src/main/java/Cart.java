import java.util.ArrayList;
import java.util.List;

public class Cart {
    private final User user;
    private final List<Product> products;
    private double totalAmount;

    public Cart(User user) {
        this.user = user;
        this.products = new ArrayList<>();
        this.totalAmount = 0.0;
    }

    // добавляем товар в корзину
    public void addProduct(Product product) {
        if (product == null) {
            throw new IllegalArgumentException("Товар не найден");
        } products.add(product);
        totalAmount += product.getPrice();
    }

    // удаляем товар из корзины
    public boolean removeProduct(Product product) {
        if (product == null) {
            throw new IllegalArgumentException("Товар не найден");
        } boolean removed = products.remove(product);
        if (removed) {
            totalAmount -= product.getPrice();
        }
        return removed;
    }

    // считаем сумму товаров в корзине
    public void calculateTotalAmount() {
        totalAmount = products.stream().mapToDouble(Product::getPrice).sum();
    }

    // метод для оформления заказа
    public void checkout() {
        Order order = new Order(this);
    }

    // метод для очистки корзины
    public void clearCart() {
        products.clear();
    }
// геттеры

    public List<Product> getProducts() {
        return new ArrayList<>(products);
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public User getUser() {
        return user;
    }
}
