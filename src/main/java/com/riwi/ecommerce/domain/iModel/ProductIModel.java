package com.riwi.ecommerce.domain.iModel;


import com.riwi.ecommerce.domain.entities.Product;

import java.util.List;
import java.util.Optional;

public interface ProductIModel {
    Product createProduct(Product Product);
    List<Product> getAllProducts();
    Optional<Product> getProductById(Long ProductId);
    Product updateProduct(Product Product);
    void deleteProduct(Long ProductId);
}
