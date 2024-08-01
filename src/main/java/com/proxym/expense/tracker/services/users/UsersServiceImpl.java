package com.proxym.expense.tracker.services.users;


import com.proxym.expense.tracker.entities.UserEntity;
import com.proxym.expense.tracker.repositories.UsersRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UsersServiceImpl implements UserService {

    private final UsersRepository usersRepository;

    @Override
    public void addUser(UserEntity userEntity) {
        usersRepository.save(userEntity);
    }

    @Override
    public List<UserEntity> getAllUsers() {
        return usersRepository.findAll();
    }

    @Override
    public Optional<UserEntity> getUserById(Long id) {
        return usersRepository.findById(id);
    }

}
