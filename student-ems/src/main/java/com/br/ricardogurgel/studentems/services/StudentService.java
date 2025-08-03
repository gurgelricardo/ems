package com.br.ricardogurgel.studentems.services;

import com.br.ricardogurgel.studentems.entities.Student;
import com.br.ricardogurgel.studentems.repositories.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class StudentService {

    private StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }


    public List<Student> findAll() {
        return studentRepository.findAll();
    }

    public Optional<Student> findById(UUID id) {
        return studentRepository.findById(id);
    }

    public Optional<Object> findByAcademicRegisterNumber(Long academicRegister) {
        return studentRepository.findByAcademicRegisterNumber(academicRegister);
    }
}
