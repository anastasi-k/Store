package ru.anastasiiak.store.core;

public class Order {
    private final Cart cart;
    private OrderStatus title;

    public Order(Cart cart) {
        this.cart = cart;
    }
}
