package org.wasif.monolithic.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.wasif.monolithic.model.UserModel;
import org.wasif.monolithic.repo.UserRepo;

import java.util.List;
import java.util.UUID;

@Service
public class UserServices {
    @Autowired

    private UserRepo repo;


    //create user
    public UserModel createUser(UserModel model) {
        String userid = UUID.randomUUID().toString();
        model.setUserId(userid);
        return repo.save(model);
    }

    //get user by id
    public UserModel getUserById(String userId) {
        return repo.findById(userId).get();
    }

    public List<UserModel> getAllUsers() {
        return repo.findAll();
    }



    //get all users

}
