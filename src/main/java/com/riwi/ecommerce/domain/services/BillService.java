package com.riwi.ecommerce.domain.services;

import com.riwi.ecommerce.domain.entities.Bill;
import com.riwi.ecommerce.domain.iModel.BillIModel;
import com.riwi.ecommerce.domain.repositories.BillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BillService implements BillIModel {

    @Autowired
    private BillRepository billRepository;

    @Override
    public Bill createBill(Bill bill) {
        return this.billRepository.save(bill);
    }

    @Override
    public List<Bill> getAllBills() {
        return this.billRepository.findAll();
    }

    @Override
    public Optional<Bill> getBillById(Long billId) {
        return this.billRepository.findById(billId);
    }

    @Override
    public Bill updateBill(Bill bill) {
        return this.billRepository.save(bill);
    }

    @Override
    public void deleteBill(Long billId) {
        this.billRepository.deleteById(billId);
    }
}
