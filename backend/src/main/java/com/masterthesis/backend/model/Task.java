package com.masterthesis.backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

import java.time.LocalDate;

@Entity
@Table(name = "task")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
public class Task {
    @Id
    @GeneratedValue
    public long id;
    @NonNull
    private String title;
    private String description;
    private Integer duration;
    private LocalDate dueDate;
    private Priority prio;
    private boolean done;
}
