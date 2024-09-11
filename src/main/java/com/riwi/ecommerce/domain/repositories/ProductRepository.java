package com.riwi.ecommerce.domain.repositories;

import com.riwi.ecommerce.domain.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Long, Product> {
}
