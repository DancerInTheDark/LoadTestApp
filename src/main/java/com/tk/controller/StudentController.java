package com.tk.controller;

import com.tk.entity.Student;
import com.tk.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RequiredArgsConstructor
@RestController
@RequestMapping("api/v1/student")
public class StudentController {

  private final StudentRepository studentRepository;

  @GetMapping
  public Student saveRate() {
    Student student = new Student();
    student.setFirstname("first" + new Random().nextInt());
    student.setLastname("last" + new Random().nextInt());
    return studentRepository.save(student);
  }
}
