package com.msvc_course.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.msvc_course.persistence.entity.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {

}
