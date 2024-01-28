package com.masterthesis.backend.controller;

public class TaskNotFoundException extends RuntimeException {
    TaskNotFoundException(Long id) {
        super("Could not find task " + id);
    }
}
