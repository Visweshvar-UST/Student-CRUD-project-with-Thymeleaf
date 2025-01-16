package com.studentdemo1.studentCRUD1.service;

import com.studentdemo1.studentCRUD1.model.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class StudentArrayService {
    ArrayList<Student> students = new ArrayList<>();

    public ArrayList<Student> getStudents() {
        return students;
    }

    public Student addStudents(Student students) {
        this.students.add(students);
        return students;
    }

    public StudentArrayService(ArrayList<Student> students) {
        this.students = students;
    }

    public Optional<Student> getStudentById(Long id) {
        return students.stream()
                .filter(student -> student.getId().equals(id))
                .findFirst();
    }

    public Student updateStudent(Long id, Student updatedStudent) {
        for (Student student : students) {
            if (student.getId().equals(id)) {
                student.setName(updatedStudent.getName());
                student.setAge(updatedStudent.getAge());
                return student;
            }
        }
        return null;
    }

    public boolean deleteStudent(Long id) {
        Optional<Student> studentOpt = getStudentById(id);
        if (studentOpt.isPresent()) {
            students.remove(studentOpt.get());
            return true;
        }
        return false;
    }
    @Override
    public String toString() {
        return "StudentArrayService{" +
                "students=" + students +
                '}';
    }
}
