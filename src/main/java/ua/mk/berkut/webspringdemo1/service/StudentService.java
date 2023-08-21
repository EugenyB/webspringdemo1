package ua.mk.berkut.webspringdemo1.service;

import org.springframework.stereotype.Service;
import ua.mk.berkut.webspringdemo1.data.Student;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {
    private List<Student> students = new ArrayList<>();

    public void addStudent(Student student) {
        students.add(student);
    }

    public List<Student> findAll() {
        return students;
    }
}
