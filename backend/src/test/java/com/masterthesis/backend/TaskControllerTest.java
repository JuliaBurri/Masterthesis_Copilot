package com.masterthesis.backend;

import com.masterthesis.backend.controller.TaskController;
import com.masterthesis.backend.model.Priority;
import com.masterthesis.backend.model.Task;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.util.Arrays;

@SpringBootTest(
        webEnvironment = SpringBootTest.WebEnvironment.MOCK,
        classes = BackendApplication.class)
@AutoConfigureMockMvc
public class TaskControllerTest {

    @Autowired
    private TaskController taskController;

    @Test
    public void getAllIsNotEmpty() {
        assert (!this.taskController.getAll().isEmpty());
    }

    @Test
    public void getTaskByIdTest() {
        assert (this.taskController.getTaskById(102L).getTitle().equals("Have lunch"));
        assert (this.taskController.getTaskById(102L).getDescription().equals("cook noodles"));
    }

    @Test
    public void getPrioritiesTest() {
        assert (Arrays.equals(this.taskController.getPriorities(), Priority.values()));
    }

    @Test
    public void createTaskTest() {
    Task newTask = new Task();
    newTask.setTitle("Test Task");
    newTask.setDescription("Test Description");
    
    Task createdTask = this.taskController.createTask(newTask);
    
    assert (createdTask.getTitle().equals("Test Task"));
    assert (createdTask.getDescription().equals("Test Description"));
    assert (!createdTask.isDone());
    assert (createdTask.getDueDate().equals(LocalDate.now()));
}
}
