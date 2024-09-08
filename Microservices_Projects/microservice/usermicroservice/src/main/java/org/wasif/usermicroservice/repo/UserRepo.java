package org.wasif.usermicroservice.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.wasif.usermicroservice.model.UserModel;

public interface UserRepo extends JpaRepository<UserModel, String> {

    //create custom CRUD method



}
