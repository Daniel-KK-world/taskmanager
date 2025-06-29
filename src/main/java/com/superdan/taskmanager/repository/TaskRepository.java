package com.superdan.taskmanager.repository;
import com.superdan.taskmanager.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
    // You get findAll(), save(), deleteById(), etc. for free
}