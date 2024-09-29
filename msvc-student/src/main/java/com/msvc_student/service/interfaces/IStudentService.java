package com.msvc_student.service.interfaces;

import java.util.List;

import com.msvc_student.persistence.entity.Student;

public interface IStudentService {

    List<Student> findAll();

    Student findById(Long id);

    void save(Student student);

    List<Student> findByIdCourse(Long idCourse);
}
