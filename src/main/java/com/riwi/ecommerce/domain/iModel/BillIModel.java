package com.riwi.ecommerce.domain.iModel;

import com.riwi.ecommerce.domain.entities.Bill;

import java.util.List;
import java.util.Optional;

public interface BillIModel {
    Bill createBill(Bill bill);
    List<Bill> getAllBills();
    Optional<Bill> getBillById(Long billId);
    Bill updateBill(Bill bill);
    void deleteBill(Long billId);
}
