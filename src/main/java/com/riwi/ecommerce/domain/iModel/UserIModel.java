package com.riwi.ecommerce.domain.iModel;

import com.riwi.ecommerce.domain.entities.Bill;
import com.riwi.ecommerce.domain.entities.User;

import java.util.List;
import java.util.Optional;

public interface UserIModel {
    User createUser(User user);
    List<User> getAllUsers();
    Optional<User> getUserById(Long userId);
    User updateUser(User user);
    void deleteUser(Long userId);
}
