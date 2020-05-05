package com.alexia.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.alexia.model.Library;

@Repository("libraryRepository")
public interface LibraryRepository extends JpaRepository<Library, Integer> {
}

