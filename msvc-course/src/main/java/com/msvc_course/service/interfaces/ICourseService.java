package com.msvc_course.service.interfaces;

import java.util.List;

import com.msvc_course.persistence.entity.Course;
import com.msvc_course.service.http.response.StudentByCourseResponse;

public interface ICourseService {

    List<Course> findAll();

    Course findById(Long id);

    void save(Course course);

    StudentByCourseResponse findStudentByCourse(Long idCourse);
}
