package com.example.project2.service;

import com.example.project2.model.CourseModel;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface CourseService {

    List<CourseModel> findAllCourses();

    Optional<CourseModel> findCourseById(Long id);

    CourseModel createCourse(CourseModel course);

    CourseModel updateCourse(CourseModel course);

    void deleteCourse(Long id);
}
