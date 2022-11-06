package com.example.demo.student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@RestController
@RequestMapping(path="api/v1/student")
public class StudentController {
    @GetMapping
    public List<Student> getStudents(){
        Student Adam = new Student(1l, "Adam", "adam@gmail.com", LocalDate.of(2000, Month.MARCH, 5), 22);
        Student Jan = new Student(2l, "Jan", "jan@gmail.com", LocalDate.of(2000, Month.MARCH, 5), 23);
        return List.of(Adam, Jan);
    }

}
