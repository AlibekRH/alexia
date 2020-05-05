package com.alexia.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.alexia.model.Task;

@Repository("taskRepository")
public interface TaskRepository extends JpaRepository<Task, Integer> {
}
