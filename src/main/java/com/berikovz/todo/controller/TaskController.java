package com.berikovz.todo.controller;

import com.berikovz.todo.model.Task;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TaskController {

    @GetMapping("/tasks")
    public List<Task> getTasks() {
        return List.of(
                new Task(1, "Learn Docker"),
                new Task(2, "Learn Jenkins"),
                new Task(3, "Deploy to Kubernetes")
        );
    }
}
