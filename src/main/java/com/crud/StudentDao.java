package com.crud;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.stereotype.Service;

@Service
public class StudentDao {

    public List<Student> getStudents() {
        return Stream.of(
                new Student(27, "Madhav Paliwal", "IT-2K19-27", "Agar"),
                new Student(39, "Palak Porwal", "IT-2K19-39", "Indore"),
                new Student(8, "Avanti Gupta", "IT-2K19-08", "Barwah"),
                new Student(11, "Chirag Sharma", "IT-2K19-11", "Indore"))
                .collect(Collectors.toList());
    }

    
}
