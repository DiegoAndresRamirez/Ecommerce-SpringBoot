package com.riwi.ecommerce.domain.repositories;

import com.riwi.ecommerce.domain.entities.Bill;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BillRepository extends JpaRepository<Long, Bill> {
}
