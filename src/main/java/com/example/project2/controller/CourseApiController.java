package com.example.project2.controller;

import com.example.project2.exeptions.ResourceNotFoundException;
import com.example.project2.model.CourseModel;
import com.example.project2.service.CourseService;
import org.springframework.web.bind.annotation.*;

import jakarta.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/courses")
public class CourseApiController {

    private final CourseService courseService;

    public CourseApiController(CourseService courseService) {
        this.courseService = courseService;
    }

    @GetMapping
    public List<CourseModel> getAllCourses() {
        return courseService.findAllCourses();
    }

    @PostMapping
    public CourseModel createCourse(@Valid @RequestBody CourseModel course) {
        return courseService.createCourse(course);
    }

    @GetMapping("/{id}")
    public CourseModel getCourseById(@PathVariable Long id) {
        return courseService.findCourseById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Курс с id " + id + " не найден"));
    }
    @PutMapping("/{id}")
    public CourseModel updateCourse(@PathVariable Long id, @RequestBody CourseModel course) {
        course.setId(id);
        return courseService.updateCourse(course);
    }

    @DeleteMapping("/{id}")
    public void deleteCourse(@PathVariable Long id) {
        courseService.deleteCourse(id);
    }
}
