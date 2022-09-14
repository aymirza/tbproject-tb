package com.example.tbproject.repository;

import com.example.tbproject.model.Tutorial;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TutorialsRepository extends JpaRepository<Tutorial,Long> {
}
