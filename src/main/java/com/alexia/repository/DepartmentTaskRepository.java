package com.alexia.repository;

import com.alexia.model.Department;
import com.alexia.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.alexia.model.DepartmentTask;

import java.util.List;

@Repository("departmentTaskRepository")
public interface DepartmentTaskRepository extends JpaRepository<DepartmentTask, Integer> {
    List<DepartmentTask> findByDepartment (Department department);
    List<DepartmentTask> findByUser (User user);
}
