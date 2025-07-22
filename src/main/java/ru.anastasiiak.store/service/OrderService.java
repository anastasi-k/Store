package ru.anastasiiak.store.service;

import ru.anastasiiak.store.core.Cart;
import ru.anastasiiak.store.core.Order;
import ru.anastasiiak.store.core.OrderStatus;

public interface OrderService {
    Order checkout(Cart cart);
    void updateOrderStatus(Order order, OrderStatus status);
}
