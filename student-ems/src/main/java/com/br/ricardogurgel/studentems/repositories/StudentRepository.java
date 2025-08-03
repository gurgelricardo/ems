package com.br.ricardogurgel.studentems.repositories;

import com.br.ricardogurgel.studentems.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface StudentRepository extends JpaRepository<Student, UUID> {
    Optional<Object> findByAcademicRegisterNumber(Long academicRegisterNumber);
}
