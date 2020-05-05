package com.alexia.repository;

import com.alexia.model.Task;
import com.alexia.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.alexia.model.UserTask;

import java.util.List;

@Repository("userTaskRepository")
public interface UserTaskRepository extends JpaRepository<UserTask, Integer> {
    List<UserTask> findByTask (Task task);
    List<UserTask> findByUser (User user);
}