package org.wasif.mongodbcrud.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.CrudRepository;
import org.wasif.mongodbcrud.model.TodoModel;

import java.util.List;

// to extend the crud property or methods
public interface TodoRepo extends CrudRepository<TodoModel, Integer> {

    //to find the all todos

    @Override
    List<TodoModel> findAll();
}
