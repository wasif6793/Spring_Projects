package org.wasif.mongodbcrud.services;

// declare all methods or create all methods

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.wasif.mongodbcrud.model.TodoModel;
import org.wasif.mongodbcrud.repo.TodoRepo;

import java.util.List;

@Service
public class TodoService {
    // create add-> TodoModel,delete, update, fetch

    //to get the crud method from repo
    @Autowired
    private TodoRepo repo;

    // add todo, return , TodoModel

    public TodoModel addTodo(TodoModel model){
        return repo.save(model);
    }

    // to fetch the all todos
    public List<TodoModel> getTodos(){
        return repo.findAll();
    }

    public String deleteTodo(int todoId){
        repo.deleteById(todoId);
        return "Deleted";
    }

    public TodoModel updatTodo(int todoId, TodoModel model){
        model.setTodoId(todoId);
        return repo.save(model);
    }


}
