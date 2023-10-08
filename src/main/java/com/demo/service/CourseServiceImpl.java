package com.demo.service;

import com.demo.model.Course;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseServiceImpl implements CourseService{


    List<Course> list;

    public CourseServiceImpl()
    {

        list = new ArrayList<>();
        list.add(new Course(1,"JAva","This is a Java Course"));
        list.add(new Course(2,"Python","This is a Python Course"));
        list.add(new Course(3,"SQL","This is SQL Course"));
    }
    @Override
    public List<Course> getCourses() {
        return list;
    }

    @Override
    public Course getCourse(long courseID) {

        Course c = null;

        for (Course course : list)
        {
            if (course.getId() == courseID)
            {
                c = course;
                break;
            }
        }

        return c;
    }

    @Override
    public Course addCourse(Course course) {
        list.add(course);
        return course;
    }
}
