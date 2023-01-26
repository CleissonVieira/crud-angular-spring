package com.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.model.Course;

public interface CourseRepository extends JpaRepository<Course, Long> {

}
