package com.br.ricardogurgel.studentems.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.UuidGenerator;

import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table(name = "students")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Student {

    @Id
    @GeneratedValue
    @UuidGenerator
    private UUID id;

    private String name;
    private String surname;
    private String email;

    @Column(name = "phone_number")
    private String phoneNumber;

    @Column(name = "social_cpf")
    private String socialCPF;

    @Column(name = "social_rg")
    private String socialRG;
    private String address;

    @Column(name = "birth_date")
    private LocalDate birthDate;

    @Column(name = "academic_register_number")
    private Long academicRegisterNumber;


}
