package com.msvc_course.service.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.msvc_course.client.StudentClient;
import com.msvc_course.persistence.entity.Course;
import com.msvc_course.persistence.repository.CourseRepository;
import com.msvc_course.presentation.dto.StudentDTO;
import com.msvc_course.service.http.response.StudentByCourseResponse;
import com.msvc_course.service.interfaces.ICourseService;

@Service
public class CourseServiceImpl implements ICourseService {

    @Autowired
    private CourseRepository courseRepository;

    @Autowired
    private StudentClient studentClient;

    @Override
    public List<Course> findAll() {
        return courseRepository.findAll();
    }

    @Override
    public Course findById(Long id) {
        return courseRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("No se encontro el curso"));
    }

    @Override
    public void save(Course course) {
        courseRepository.save(course);
    }

    @Override
    public StudentByCourseResponse findStudentByCourse(Long idCourse) {
        Course course = courseRepository.findById(idCourse).orElseThrow(() -> new IllegalArgumentException("No se encontro el curso"));
        List<StudentDTO> studentDTOList = studentClient.findAllStudentByCourse(idCourse);

        return StudentByCourseResponse.builder()
                .courseName(course.getName())
                .teacherName(course.getTeacher())
                .studentDTOList(studentDTOList)
                .build();
    }
}
