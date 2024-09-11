package com.riwi.ecommerce.domain.repositories;

import com.riwi.ecommerce.domain.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Long, User> {
}
