package com.alexia.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.alexia.model.It;

@Repository("itRepository")
public interface ItRepository extends JpaRepository<It, Integer> {
}

