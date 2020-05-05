package com.alexia.repository;

import com.alexia.model.Library;
import com.alexia.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.alexia.model.LibraryTask;

import java.util.List;

@Repository("libraryTaskRepository")
public interface LibraryTaskRepository extends JpaRepository<LibraryTask, Integer> {
    List<LibraryTask> findByLibrary (Library library);
    List<LibraryTask> findByUser (User user);
}