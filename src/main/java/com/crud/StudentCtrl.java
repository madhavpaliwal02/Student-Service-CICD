package com.crud;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudentCtrl {

    @Autowired
    private StudentDao studentDao;

    @GetMapping
    public List<Student> getStudents() {
        return studentDao.getStudents();
    }

    @GetMapping("/sorted")
    public List<Student> getStudentSorted() {
        return studentDao.getStudents().stream().sorted(Comparator.comparing(Student::getId))
                .collect(Collectors.toList());
    }

}
