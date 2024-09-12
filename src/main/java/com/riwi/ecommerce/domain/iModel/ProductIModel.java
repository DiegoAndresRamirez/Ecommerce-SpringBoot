package com.riwi.ecommerce.domain.iModel;

public interface ProductIModel {

    void reduceStock(Long productId, int quantity);

    void increaseStock(Long productId, int quantity);

    boolean hasSufficientStock(Long productId, int quantity);

    Double getPrice(Long productId);

    void applyDiscount(Long productId, Double discountPercentage);

    void associateWithInvoice(Long productId, Long invoiceId);

}
