package ru.anastasiiak.store.repository;

import ru.anastasiiak.store.core.Product;
import java.util.List;

public interface ProductRepository {

    Product createProduct(String name, double price);
    List<Product> getAllProducts();
    Product findByName(String name);
}
