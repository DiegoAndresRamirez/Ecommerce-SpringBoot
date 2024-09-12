package com.riwi.ecommerce.domain.iModel;


import com.riwi.ecommerce.domain.entities.Product;

import java.util.List;
import java.util.Optional;

public interface ProductIModel {
    Product createProduct(Product product);
    List<Product> getAllProducts();
    Optional<Product> getProductById(Long productId);
    Product updateProduct(Product product);
    void deleteProduct(Long productId);
}
