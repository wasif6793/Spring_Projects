package org.wasif.mongodbcrud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.wasif.mongodbcrud.model.TodoModel;
import org.wasif.mongodbcrud.services.TodoService;

import java.util.List;

// to declare the api url using endpoint and call the methods from services
@RestController
@RequestMapping(value = "/todo")
public class TodoController {

    @Autowired
    private TodoService service;

    //to add todos
    @PostMapping
    public TodoModel addTodos(@RequestBody TodoModel model){
        return service.addTodo(model);
    }

    //to get todos
    @GetMapping
    public List<TodoModel> getTodos(){
        return service.getTodos();
    }

    @DeleteMapping (value ="/{todoId}")
    public String deleteTodo(@PathVariable("todoId") @RequestBody int todoId){
        return service.deleteTodo(todoId);
    }

    @PutMapping(value = "/{todoId}")
    public TodoModel updateTodos(@PathVariable("todoId") @RequestBody int todoId, @RequestBody TodoModel model){
        return service.updatTodo(todoId, model);
    }
}
