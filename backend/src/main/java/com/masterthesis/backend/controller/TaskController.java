package com.masterthesis.backend.controller;

import com.masterthesis.backend.model.Priority;
import com.masterthesis.backend.repository.TaskRepository;
import com.masterthesis.backend.model.Task;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:5173")
@RestController
@RequestMapping("/api/tasks")
public class TaskController {
    private final TaskRepository repository;

    TaskController(TaskRepository repository) {
        this.repository = repository;
    }

    @GetMapping()
    public List<Task> getAll() {
        return repository.findAll();
    }

    /**
     * Get a task by id
     *
     * @param id the id of the task
     * @return Task
     * @throws TaskNotFoundException if the task is not found
     */
    @GetMapping("/{id}")
    public Task getTaskById(@PathVariable Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new TaskNotFoundException(id));
    }

    /* User Story 1: As a user I want to add a new task to my task list
     *TODO: Add request method to create new task
     * ACCEPTANCE CRITERIA: The task is added to the task list
     *                      The task is not done
     *                      The task has a title, description, duration, priority and due date
     *                      The dueDate is automatically set to the current date
     *                      The function is documented as a Javadoc comment
     *                      The function is tested
     */

    /* User story 2: As a user I want to set a task to done
     * TODO: Add request method to update existing task / set Task to done
     *  ACCEPTANCE CRITERIA: The task is set to done
     *                       The function is documented as a Javadoc comment
     *                       The function is tested
     */

    @GetMapping("/schedule")
    public List<Task> getWorkDaySchedule(@PathVariable Long id) {
        /* User story 3: As a user I want my work day to be scheduled by priority
         *TODO: Schedule work day with Knappsack algorithm
         * *ACCEPTANCE CRITERIA: The tasks are scheduled by priority
         * The function is documented as a Javadoc comment
         * The function is tested
         *
         * A Work day is 8 hours long, the tasks should fit into this time limit
         * The tasks should be sorted by priority
         * If a task fits only partly in the time limit, the remaining time should be scheduled for the next day
         * The tasks that not fit into the time limit should be scheduled for the next day
         */
        return repository.findAll();
    }

    @DeleteMapping("/{id}")
    void deleteTask(@PathVariable Long id) {
        repository.deleteById(id);
    }

    @GetMapping("/priorities")
    public Priority[] getPriorities() {
        return Priority.values();
    }
}
