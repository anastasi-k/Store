import java.util.ArrayList;
import java.util.List;

public class App {
    private List<Product> availableProducts;
    private List<User> registeredUsers;
    private List<Order> allOrder;


    public StoreService(){
        this.availableProducts = new ArrayList<>();
        this.registeredUsers = new ArrayList<>();
        this.allOrder = new ArrayList<>();

    }

    // создание нового товара
    public Product createProduct(String name, double price) {
        Product newProduct = new Product(name, price);
        availableProducts.add(newProduct);
        return newProduct;
    }

    // регистрация и создание пользователя
    public User registerUser(String login, String password) {
        if (login == null || login.isEmpty() && password == null || password.isEmpty()) {
            throw new IllegalArgumentException("Поля для логина и пароля не могут быть пустыми");
        }

        if (!PasswordSetup.isValidPassword(password)) {
            throw new IllegalArgumentException("Пароль не соответствует требованиям");
        }

        User newUser = new User(login, password);
        registeredUsers.add(newUser);
        return newUser;
    }

    // создание корзины
    public Cart createCart(User user) {
        if (user == null){
            throw new IllegalArgumentException("Пользователь не найден");
        }
        return new Cart(user);
    }

    // создание заказа
    public Order checkout(Cart cart) {
        if (cart == null || cart.getProducts().isEmpty()) {
            throw new IllegalArgumentException("Корзина пуста");
        }

        Order newOrder = new Order(cart);
        allOrder.add(newOrder);
        cart.clearCart();
        return newOrder;
    }
}
