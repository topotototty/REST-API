package com.example.project2.repository;

import com.example.project2.model.CourseModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<CourseModel, Long> {
}
