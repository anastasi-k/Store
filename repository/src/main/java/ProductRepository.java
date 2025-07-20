import java.util.List;

public interface ProductRepository {

    Product createProduct(String name, double price);
    List<Product> getAllProducts();
    Product findByName(String name);
}
