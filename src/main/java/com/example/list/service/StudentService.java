package com.example.list.service;

import com.example.list.model.Student;

import java.util.List;

public interface StudentService {
    public Student saveStudent(Student student);
    public List<Student> getAllStudents();
    void deleteStudent(Long id); // Add this method

}
