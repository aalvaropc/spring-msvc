package com.msvc_student.presentation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.msvc_student.persistence.entity.Student;
import com.msvc_student.service.interfaces.IStudentService;

@RestController
@RequestMapping("/api/student")
public class StudentController {

    @Autowired
    private IStudentService studentService;

    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public void saveStudent(@RequestBody Student student) {
        studentService.save(student);
    }

    @GetMapping("/all")
    public ResponseEntity<?> findAllStudent() {
        return ResponseEntity.ok(studentService.findAll());
    }

    @GetMapping("/search/{id}")
    public ResponseEntity<?> findById(@PathVariable Long id) {
        return ResponseEntity.ok(studentService.findById(id));
    }

    @GetMapping("/search-my-course/{idCourse}")
    public ResponseEntity<?> fidByIdCourse(@PathVariable Long idCourse) {
        return ResponseEntity.ok(studentService.findByIdCourse(idCourse));
    }
}
