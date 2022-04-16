package com.example.demo.controller;
import com.example.demo.entity.Course;
import com.example.demo.service.CourseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "*")
public class MyController {
    @Autowired
    private CourseServiceImpl courseService;

   @GetMapping("/home")
    public String home(){
        return  "Welcome to courses application";
    }

    @GetMapping("/courses")
    public List<Course> getAllCourses(){
      return   courseService.getCourses();
    }

   @GetMapping("/courses/{courseId}")
    public Optional<Course> getCourse(@PathVariable Long courseId){
        return courseService.getCourse(courseId);
    }

    @PostMapping("/courses")
    public Course addCourse(@RequestBody Course course){

        return  courseService.addCourse(course);
    }

    @DeleteMapping("/courses/{courseId}")
    public ResponseEntity<HttpStatus>deleteCourse(@PathVariable long courseId){
        try {
            courseService.deleteCourse(courseId);
            return new ResponseEntity<>(HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("/courses")
    public Course updateCourse(@RequestBody Course course){
     return    courseService.updateCourse(course);
    }
}
