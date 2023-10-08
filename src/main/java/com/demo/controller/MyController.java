package com.demo.controller;

import com.demo.model.Course;
import com.demo.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MyController {

    @Autowired
    public CourseService courseService;

    @GetMapping("/courses")
    public List<Course> getCourses()
    {
        return courseService.getCourses();
    }

    @GetMapping("/courses/{courseID}")
    public Course getCourse(@PathVariable String courseID)
    {
        return courseService.getCourse(Long.parseLong(courseID));
    }

    @PostMapping("/addCourse")
    public Course addCourse(@RequestBody Course course)
    {
        return courseService.addCourse(course);
    }

}
