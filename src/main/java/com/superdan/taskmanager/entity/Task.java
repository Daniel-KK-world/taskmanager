package com.superdan.taskmanager.entity;

import com.superdan.taskmanager.entity.User;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String description;
    private boolean completed;

    @ManyToOne
    @JoinColumn(name = "user_id")  // Foreign key column in the Task table
    private User user;

    // Lombok will auto-generate getters and setters for all fields
}