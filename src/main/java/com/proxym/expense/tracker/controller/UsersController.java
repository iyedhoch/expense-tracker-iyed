package com.proxym.expense.tracker.controller;


import com.proxym.expense.tracker.entities.UserEntity;
import com.proxym.expense.tracker.services.users.UserService;
import lombok.RequiredArgsConstructor;
import org.apache.catalina.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.RequestScope;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UsersController {

    private final  UserService userService ;
    @GetMapping()
    public ResponseEntity<List<UserEntity>>getAllUsers()
    {
        List<UserEntity> users =userService.getAllUsers();
        return new ResponseEntity<>(users, HttpStatus.OK);
    }
    @GetMapping("{id}")
    public ResponseEntity<UserEntity>getUserById(@PathVariable("id") String id)
    {
        UserEntity users =userService.getUserById(Long.valueOf(id));
        return users==null ?  new ResponseEntity<>(HttpStatus.NOT_FOUND):new ResponseEntity<>(users, HttpStatus.OK);
    }
    @PostMapping( )
    public ResponseEntity<Boolean> addUser(@RequestBody UserEntity user)
    {
        userService.addUser(user);
         return new ResponseEntity<>(true,HttpStatus.CREATED);
    }

    @PutMapping("{id}")
    public ResponseEntity<UserEntity> updateUser(@RequestBody UserEntity user,@PathVariable("id") String id)
    {
        return new ResponseEntity<>(userService.updateUser(Long.valueOf(id),user), HttpStatus.OK);
    }
}
