package com.backend.coursemanagementbackend.Service;


import com.backend.coursemanagementbackend.entities.Course;

import java.util.List;
import java.util.Optional;

public interface CourseService {
    public List<Course> getCourses();

    public Optional<Course> getCourse(Long id);

    public Course addCourse(Course course);

    public Course updateCourse(Course course);

    public void deleteCourse(Long courseId);
}
