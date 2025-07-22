package ru.anastasiiak.store.core;


import lombok.EqualsAndHashCode;
import lombok.ToString;

@ToString
@EqualsAndHashCode
public class Product {

    private final String name;
    private final double price;


    // constructor
    public Product(String name, double price) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Поле 'имя' не может быть пустым");
        }
        if (price <= 0) {
            throw new IllegalArgumentException("Цена не может быть отрицательной или равной нулю");
        }
        this.name = name;
        this.price = price;
    }

    // getters
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
