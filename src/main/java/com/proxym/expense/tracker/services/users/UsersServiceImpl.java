package com.proxym.expense.tracker.services.users;


import com.proxym.expense.tracker.entities.UserEntity;
import com.proxym.expense.tracker.repositories.UsersRepository;
import lombok.RequiredArgsConstructor;
import org.apache.catalina.User;
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
    public UserEntity getUserById(Long id) {

        Optional<UserEntity> userEntity =  usersRepository.findById(id);
        if(userEntity.isPresent())
            return userEntity.get();
        else
            return null;
    }

    @Override
    public void addUse(UserEntity userEntity) {
        usersRepository.save(userEntity);
    }

    @Override
    public UserEntity updateUser(Long id, UserEntity userEntity) {

       Optional<UserEntity> user = usersRepository.findById(id);
       if(user.isPresent())
       {
           if(userEntity.getEmail()!=null)
               user.get().setEmail(userEntity.getEmail());
           if(userEntity.getPassword()!=null)
               user.get().setPassword(userEntity.getPassword());
           if(userEntity.getUsername()!=null)
               user.get().setUsername(userEntity.getUsername());

           usersRepository.save(user.get());
           return user.get();

       }
       else
          return usersRepository.save(userEntity);
    }
}
