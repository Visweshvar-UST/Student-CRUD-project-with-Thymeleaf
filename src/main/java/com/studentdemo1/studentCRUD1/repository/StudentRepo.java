package com.studentdemo1.studentCRUD1.repository;

import com.studentdemo1.studentCRUD1.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepo extends JpaRepository<Student,Long> {
}
