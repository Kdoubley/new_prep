package Jar;

import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/tasks")
public class TaskController {

    private List<Task> tasks = new ArrayList<>();

    // GET /tasks - returns all tasks
    @GetMapping
    public List<Task> getAllTasks() {
        return tasks;
    }

    // POST /tasks - adds a new task
    @PostMapping
    public Task createTask(@RequestBody Task task) {
        tasks.add(task);
        return task;
    }

    // DELETE /tasks/{id} - deletes a task by id
    @DeleteMapping("/{id}")
    public String deleteTask(@PathVariable int id) {
        tasks.removeIf(t -> t.getId() == id);
        return "Task " + id + " deleted";
    }
}