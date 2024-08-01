package com.proxym.expense.tracker.services.users;

import com.proxym.expense.tracker.entities.UserEntity;

import java.util.List;
import java.util.Optional;

public interface UserService {
    void addUser(UserEntity userEntity);

    List<UserEntity>getAllUsers();
    UserEntity getUserById(Long id);

     void addUse(UserEntity userEntity);

     UserEntity updateUser(Long id,UserEntity userEntity);

}
