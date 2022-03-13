package com.example.demo.student;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/v1/students")
public class studentController {

    private  static final List<Student>STUDENTS = Arrays.asList(
            new Student(1, "Mohammad"),
            new Student(2,"Rakib Hossen"),
            new Student(3, "Alfi Akash Prio")
                );
    @RequestMapping(path = "{studentId}")
    public Student getStudent(@PathVariable("studentId") Integer studentId){
        return STUDENTS.stream()
                .filter(student -> studentId.equals(student.getStudentId()))
                .findFirst()
                .orElseThrow(()-> new IllegalArgumentException("Students "+ studentId + "does not exists!!!!!"));
    }
}
