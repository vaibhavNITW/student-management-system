package com.sms.student_management_system.repository;

import com.sms.student_management_system.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    // Custom query methods if needed
    List<Student> findByLastName(String lastName);
    List<Student> findByFirstNameContainingOrLastNameContaining(String firstName, String lastName);
    boolean existsByEmail(String email);
}