package com.riwi.ecommerce.domain.repositories;

import com.riwi.ecommerce.domain.entities.Bill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BillRepository extends JpaRepository<Bill, Long> {
}
