package org.wasif.monolithic.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.wasif.monolithic.model.UserModel;

public interface UserRepo extends JpaRepository<UserModel, String> {

    //create custom CRUD method



}
