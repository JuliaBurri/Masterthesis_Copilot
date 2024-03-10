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

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.MOCK, classes = BackendApplication.class)
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
    public void addTask() {
        var addedTaskId = this.taskController.addTask(new Task(
                "Have lunch",
                "cook noodles",
                10,
                Priority.HIGH));
        var storedTask = this.taskController.getTaskById(addedTaskId);
        assert (storedTask.getTitle().equals("Have lunch"));
        assert (storedTask.getDescription().equals("cook noodles"));
        assert (storedTask.getPrio().equals(Priority.HIGH));
        assert (storedTask.getDuration().equals(10));
        assert (storedTask.getPrio().equals(Priority.HIGH));
        assert (storedTask.getDueDate().equals(LocalDate.now()));
        assert (Boolean.valueOf(storedTask.isDone()).equals(false));

        assert (this.taskController.getTaskById(102L).getDescription().equals("cook noodles"));
    }

    @Test
    public void getPrioritiesTest() {
        assert (Arrays.equals(this.taskController.getPriorities(), Priority.values()));
    }
}
