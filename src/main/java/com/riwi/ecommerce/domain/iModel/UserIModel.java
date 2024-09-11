package com.riwi.ecommerce.domain.iModel;

import com.riwi.ecommerce.domain.entities.Bill;

import java.util.List;

public interface UserIModel {
    List<Bill> getBills(Long userId);

    Double calculateTotalSpent(Long userId);

    boolean hasUnpaidInvoices(Long userId);

    void updateUserData(Long userId, String name, String email);

    boolean isEmailUnique(String email);
}
