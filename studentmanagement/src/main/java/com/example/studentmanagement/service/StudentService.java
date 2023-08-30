package com.example.studentmanagement.service;

import com.example.studentmanagement.entity.Student;
import java.util.List;
import java.util.Optional;

public interface StudentService {

    List<Student> getAllStudents();

    Optional<Student> getStudentById(Long id);

    Student createStudent(Student student);

    Student updateStudent(Student student);

    void deleteStudent(Long id);
}

