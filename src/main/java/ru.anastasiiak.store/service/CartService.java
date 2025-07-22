package ru.anastasiiak.store.service;

import ru.anastasiiak.store.core.Cart;
import ru.anastasiiak.store.core.Product;
import ru.anastasiiak.store.core.User;

public interface CartService {
    Cart createCart(User user);
    void addProduct(Cart cart, Product product);
    void removeProduct(Cart cart, Product product);
}
