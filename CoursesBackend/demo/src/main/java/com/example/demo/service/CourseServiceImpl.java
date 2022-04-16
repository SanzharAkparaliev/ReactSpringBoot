package com.example.demo.service;

import com.example.demo.entity.Course;
import com.example.demo.repository.CourseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CourseServiceImpl implements CourseService{
    @Autowired
    private CourseRepo repo;
    @Override
    public List<Course> getCourses() {
        return repo.findAll();
    }

    @Override
    public Optional<Course> getCourse(Long courseId) {
        return repo.findById(courseId);
    }

    @Override
    public Course addCourse(Course course) {
        return repo.save(course);
    }

    @Override
    public Course updateCourse(Course course) {
        return repo.save(course);
    }

    @Override
    public void deleteCourse(Long parseLong) {
            repo.deleteById(parseLong);
    }
}
