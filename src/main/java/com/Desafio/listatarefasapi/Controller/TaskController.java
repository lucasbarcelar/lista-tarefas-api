package com.Desafio.listatarefasapi.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.Desafio.listatarefasapi.entity.Task;
import com.Desafio.listatarefasapi.repository.TaskRepository;

@RestController
@RequestMapping("/api/tasks")
public class TaskController {
    private final TaskRepository taskRepository;

    public TaskController(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @GetMapping
    public List<Task> getTasks() {
        return taskRepository.findAll();
    }

    @PostMapping
    public Task createTask(@RequestBody Task task) {
        return taskRepository.save(task);
    }

    @PutMapping("/{taskId}")
    public ResponseEntity<Task> updateTask(@PathVariable Long taskId, @RequestBody Task updatedTask) {
        Optional<Task> taskOptional = taskRepository.findById(taskId);

        if (!taskOptional.isPresent()) {
            return ResponseEntity.notFound().build();
        }

        Task task = taskOptional.get();
        task.setDescription(updatedTask.getDescription());
        task.setCompleted(updatedTask.isCompleted());

        taskRepository.save(task);

        return ResponseEntity.ok(task);
    }

    @DeleteMapping("/{taskId}")
    public ResponseEntity<Void> deleteTask(@PathVariable Long taskId) {
        Optional<Task> taskOptional = taskRepository.findById(taskId);

        if (!taskOptional.isPresent()) {
            return ResponseEntity.notFound().build();
        }

        taskRepository.deleteById(taskId);

        return ResponseEntity.noContent().build();
    }
}
