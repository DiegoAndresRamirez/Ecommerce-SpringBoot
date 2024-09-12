package com.riwi.ecommerce.domain.iModel;

import com.riwi.ecommerce.domain.entities.Bill;

import java.util.List;
import java.util.Optional;

public interface BillIModel {
    Bill createBill(Bill Bill);
    List<Bill> getAllBills();
    Optional<Bill> getBillById(Long BillId);
    Bill updateBill(Bill Bill);
    void deleteBill(Long BillId);
}
