package dev.nahum.todo_api.controller;

import dev.nahum.todo_api.model.Task;
import dev.nahum.todo_api.service.TaskService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class TaskController {

    private final TaskService taskService;

    public Task createTask(Task task){
        return taskService.createTask(task);
    }

    public Task updateTask(Task task){
        return taskService.updateTask(task);
    }

    public ResponseEntity<Void> deleteById(Long id){
        taskService.deleteTaskById(id);
        return ResponseEntity.noContent().build();
    }

    public List<Task> findAll(){
        return taskService.findAll();
    }

    public Task findById(Long id){
        return taskService.findById(id);
    }


}
