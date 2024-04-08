package fun.digitallpepper.logistic_service.service;

import fun.digitallpepper.logistic_service.model.Product;

import java.util.List;

public interface ProductServise {
    Product saveProduct(Product product);
    Product updateProduct(Product product);
    void deleteProductById(Long id);
    Product findProductById(Long id);
    List<Product> findAllProducts();
}
