package com.proxym.expense.tracker.controller;


import com.proxym.expense.tracker.entities.UserEntity;
import com.proxym.expense.tracker.services.users.UserService;
import lombok.RequiredArgsConstructor;
import org.apache.catalina.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UsersController {

    private  final UserService userService;

    @GetMapping("")
    public ResponseEntity<List<UserEntity>>getAllUsers()
    {
        return new ResponseEntity<>(userService.getAllUsers(), HttpStatus.OK);
    }

    @GetMapping("/{id}/{username}")
    public ResponseEntity<UserEntity>getUser(@PathVariable("id") String id)
    {
        Optional<UserEntity> userEntity = userService.getUserById(Long.valueOf(id));
        if(userEntity.isPresent()) {
            return new ResponseEntity<>(userEntity.get(), HttpStatus.OK);
        }
            else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

    }


}


