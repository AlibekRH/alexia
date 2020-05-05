package com.alexia.repository;

import com.alexia.model.Teacher;
import com.alexia.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.alexia.model.TeacherTask;

import java.util.List;

@Repository("teacherTaskRepository")
public interface TeacherTaskRepository extends JpaRepository<TeacherTask, Integer> {
    List<TeacherTask> findByTeacher (Teacher teacher);
    List<TeacherTask> findByUser (User user);
}