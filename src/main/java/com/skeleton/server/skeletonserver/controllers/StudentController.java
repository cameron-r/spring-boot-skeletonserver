package com.skeleton.server.skeletonserver.controllers;

import com.skeleton.server.skeletonserver.repositories.StudentRepository;
import com.skeleton.server.skeletonserver.responses.StudentResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/students")
public class StudentController {

    private final StudentRepository studentRepository;

    @Autowired
    public StudentController(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @GetMapping("")
    @ResponseStatus(HttpStatus.OK)
    public List<StudentResponse> findStudents() {
        return studentRepository.findAll().stream()
                .map(s -> new StudentResponse(s.id, s.name))
                .collect(Collectors.toList());
    }
}
