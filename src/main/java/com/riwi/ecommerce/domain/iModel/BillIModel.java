package com.riwi.ecommerce.domain.iModel;

import com.riwi.ecommerce.domain.entities.Product;
import com.riwi.ecommerce.domain.entities.User;

import java.util.List;

public interface BillIModel {

    Double calculateTotal(Long billId);

    void markAsPaid(Long billId);

    boolean isPending(Long billId);

    void addProduct(Long billId, Long productId, int quantity);

    void removeProduct(Long billId, Long productId);

    List<Product> getProducts(Long billId);

    User getUser(Long billId);
}
