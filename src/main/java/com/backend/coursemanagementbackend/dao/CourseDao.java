package com.backend.coursemanagementbackend.dao;

import com.backend.coursemanagementbackend.entities.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CourseDao extends JpaRepository<Course,Long> {

}
