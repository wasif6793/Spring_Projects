package org.wasif.monolithic.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.wasif.monolithic.model.UserModel;
import org.wasif.monolithic.service.UserServices;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserServices services;


    //create user
    @PostMapping()
    public UserModel addUser(@RequestBody UserModel user) {
        return services.createUser(user);
    }

    @GetMapping()
    public List<UserModel> getAllUsers() {
        return services.getAllUsers();
    }

    @GetMapping("/{userId}")
    public UserModel getUserById(@PathVariable("userId") String userId) {
        return services.getUserById(userId);
    }





}
