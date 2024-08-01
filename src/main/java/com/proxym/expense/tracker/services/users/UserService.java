package com.proxym.expense.tracker.services.users;

import com.proxym.expense.tracker.entities.UserEntity;

import java.util.List;
import java.util.Optional;

public interface UserService {
    void addUser(UserEntity userEntity);

    List<UserEntity>getAllUsers();
     Optional<UserEntity> getUserById(Long id);
}
