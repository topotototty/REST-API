package com.example.project2.service;

import com.example.project2.model.CourseModel;
import com.example.project2.repository.CourseRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CourseServiceImpl implements CourseService {

    private final CourseRepository courseRepository;


    public CourseServiceImpl(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }


    @Override
    public List<CourseModel> findAllCourses() {
        return courseRepository.findAll();
    }

    @Override
    public CourseModel createCourse(CourseModel course) {
        return courseRepository.save(course);
    }

    @Override
    public CourseModel updateCourse(CourseModel course) {
        return courseRepository.save(course);
    }

    @Override
    public void deleteCourse(Long id) {
        courseRepository.deleteById(id);
    }

    @Override
    public Optional<CourseModel> findCourseById(Long id) {
        return courseRepository.findById(id);
    }
}
