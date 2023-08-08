package com.backend.coursemanagementbackend.Service;

import com.backend.coursemanagementbackend.dao.CourseDao;
import com.backend.coursemanagementbackend.entities.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CourseServiceImplementation implements CourseService{

    @Autowired
    private CourseDao courseDao;
    @Override
    public List<Course> getCourses() {
        return courseDao.findAll();
    }

    @Override
    public Optional<Course> getCourse(Long id) {
        return courseDao.findById(id);
    }

    @Override
    public Course addCourse(Course course) {
        courseDao.save(course);
        return course;
    }

    @Override
    public Course updateCourse(Course course) {
        courseDao.save(course);
        return course;
    }

    @Override
    public void deleteCourse(Long courseId) {
        if(!courseDao.existsById(courseId))
        {
            throw new RuntimeException("usernotfound");
        }
        courseDao.deleteById(courseId);
    }
}
