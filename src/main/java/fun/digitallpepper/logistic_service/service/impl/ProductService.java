package fun.digitallpepper.logistic_service.service.impl;

import fun.digitallpepper.logistic_service.model.Product;
import fun.digitallpepper.logistic_service.repository.ProductRepository;
import fun.digitallpepper.logistic_service.service.ProductServise;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
@Primary
public class ProductService implements ProductServise {
    private final ProductRepository repository;

    @Override
    public Product saveProduct(Product product) {
        return repository.save(product);
    }

    @Override
    public Product updateProduct(Product product) {
        return repository.save(product);
    }

    @Override
    public void deleteProductById(Long id) {
        repository.deleteById(id);
    }

    @Override
    public Product findProductById(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public List<Product> findAllProducts() {
        return repository.findAll();
    }
}
