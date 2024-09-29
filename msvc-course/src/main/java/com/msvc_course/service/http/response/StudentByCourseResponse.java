package com.msvc_course.service.http.response;

import java.util.List;

import com.msvc_course.presentation.dto.StudentDTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class StudentByCourseResponse {

    private String courseName;
    private String teacherName;
    private List<StudentDTO> studentDTOList;
}
