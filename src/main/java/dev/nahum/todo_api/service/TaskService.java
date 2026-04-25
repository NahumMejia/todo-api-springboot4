package dev.nahum.todo_api.service;

import dev.nahum.todo_api.model.Task;
import dev.nahum.todo_api.repository.TaskRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@RequiredArgsConstructor
@Service
public class TaskService {

    private final TaskRepository taskRepository;

    public Task createTask(Task task){
        return taskRepository.save(task);
    }

    public Task updateTask(Task task){
        return taskRepository.save(task);
    }

    public void deleteTask(Long id){
        taskRepository.deleteById(id);
    }

    public Task findById(Long id){
        return  taskRepository.findById(id)
                .orElseThrow(() -> new NoSuchElementException("Task not found: " + id));
    }
}
