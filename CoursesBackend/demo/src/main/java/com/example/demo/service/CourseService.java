package com.example.demo.service;

import com.example.demo.entity.Course;

import java.util.List;
import java.util.Optional;


public interface CourseService {
    public List<Course> getCourses();
    public Optional<Course> getCourse(Long courseId);

    public Course addCourse(Course course);
    public Course updateCourse(Course course);
    public void deleteCourse(Long parseLong);
}
