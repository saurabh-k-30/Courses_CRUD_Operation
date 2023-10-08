package com.demo.service;

import com.demo.model.Course;

import java.util.List;

public interface CourseService {

    public List<Course> getCourses();

    public Course getCourse(long courseID);

    public Course addCourse(Course course);
}
