package org.wasif.mongodbcrud.model;

//to bind data within class means encapsulation

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "todocollection")
public class TodoModel {
    @Id
    private int todoId;
    private String todoTask;
    private String todoDate;

    public int getTodoId() {
        return todoId;
    }

    public void setTodoId(int todoId) {
        this.todoId = todoId;
    }

    public String getTodoDate() {
        return todoDate;
    }

    public void setTodoDate(String todoDate) {
        this.todoDate = todoDate;
    }

    public String getTodoTask() {
        return todoTask;
    }

    public void setTodoTask(String todoTask) {
        this.todoTask = todoTask;
    }

    public TodoModel(String todoTask, String todoDate) {
        this.todoTask = todoTask;
        this.todoDate = todoDate;
    }

}
