package com.studentdemo1.studentCRUD1.service;

import com.studentdemo1.studentCRUD1.model.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class StudentArrayService {
    ArrayList<Student> students = new ArrayList<>();

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public StudentArrayService(ArrayList<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "StudentArrayService{" +
                "students=" + students +
                '}';
    }
}
