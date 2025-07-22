package ru.anastasiiak.store.app;

import ru.anastasiiak.store.core.PasswordSetup;
import ru.anastasiiak.store.core.Product;
import ru.anastasiiak.store.core.User;
import ru.anastasiiak.store.repository.ProductRepository;
import ru.anastasiiak.store.repository.UserRepository;
import ru.anastasiiak.store.service.CartService;
import ru.anastasiiak.store.service.OrderService;

public class StoreService {

    private final ProductRepository productRepository;
    private final UserRepository userRepository;
    private final CartService cartService;
    private final OrderService orderService;

//    constructor
    public StoreService(ProductRepository productRepository,
                        UserRepository userRepository,
                        CartService cartService,
                        OrderService orderService) {
        this.productRepository = productRepository;
        this.userRepository = userRepository;
        this.cartService = cartService;
        this.orderService = orderService;
    }

// method for creating Product instance
    public Product createProduct(String name, double price) {
        return productRepository.createProduct(name, price);
    }

//    method for creating User instance
    public User registerUser(String login, String password) {
        if (!PasswordSetup.isValidPassword(password)) {
            throw new IllegalArgumentException("Пароль не соответствует требованиям");
        }
        return userRepository.registerUser(login, password);
    }

}
