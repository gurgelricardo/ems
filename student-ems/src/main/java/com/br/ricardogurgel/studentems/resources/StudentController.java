package com.br.ricardogurgel.studentems.resources;

import com.br.ricardogurgel.studentems.entities.Student;
import com.br.ricardogurgel.studentems.services.StudentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping(value = "/students")
public class StudentController {

    private StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping
    public ResponseEntity<List<Student>> findAll() {
        return ResponseEntity.ok(studentService.findAll());
    }

    @GetMapping(value = "/id/{id}")
    public ResponseEntity<Optional<Student>> findById(@PathVariable UUID id) {
        return ResponseEntity.ok(studentService.findById(id));
    }

    @GetMapping(value = "/ar/{academicRegister}")
    public ResponseEntity<Optional<Object>> findByAcademicRegister(@PathVariable Long academicRegister) {
        return ResponseEntity.ok(studentService.findByAcademicRegisterNumber(academicRegister));
    }

}
