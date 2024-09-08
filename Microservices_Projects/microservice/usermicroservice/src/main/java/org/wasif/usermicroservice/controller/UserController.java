package org.wasif.usermicroservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.wasif.usermicroservice.model.UserModel;
import org.wasif.usermicroservice.service.UserServices;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserServices services;

    @PostMapping()
    public UserModel addUser(@RequestBody UserModel userModel) {

        return services.createUser(userModel);
    }

    @GetMapping()
    public List<UserModel> getAllUsers() {
        return services.getAllUsers();
    }

    @GetMapping("/{userId}")
    public UserModel getUserById(@PathVariable("userId") @RequestBody String userId) {
        return services.getUserById(userId);
    }





}
