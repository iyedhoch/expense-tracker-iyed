package com.proxym.expense.tracker.controller;


import com.proxym.expense.tracker.entities.UserEntity;
import com.proxym.expense.tracker.services.users.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UsersController {

    private final  UserService userService ;
    @GetMapping()
    public ResponseEntity<List<UserEntity>>getTest()
    {
        List<UserEntity> users =userService.getAllUsers();
        return new ResponseEntity<>(users, HttpStatus.OK);
    }

}
