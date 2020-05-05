package com.alexia.repository;

import com.alexia.model.It;
import com.alexia.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.alexia.model.ItTask;

import java.util.List;

@Repository("itTaskRepository")
public interface ItTaskRepository extends JpaRepository<ItTask, Integer> {
    List<ItTask> findByIt (It it);
    List<ItTask> findByUser (User user);
}
