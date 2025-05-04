package com.sms.student_management_system.service;

import com.sms.student_management_system.model.Student;
import com.sms.student_management_system.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;

    @Autowired
    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Student getStudentById(Long id) {
        return studentRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Student not found with id: " + id));//new ResourceNotFoundException("Student not found with id: " + id));
    }

    @Override
    public Student createStudent(Student student) {
        if(studentRepository.existsByEmail(student.getEmail())) {
            throw new RuntimeException("Student email already exists, " + student.getEmail());
        }
        return studentRepository.save(student);
    }

    @Override
    public Student updateStudent(Long id, Student studentDetails) {
        Student student = getStudentById(id);

        // Update student fields
        student.setFirstName(studentDetails.getFirstName());
        student.setLastName(studentDetails.getLastName());
        student.setDateOfBirth(studentDetails.getDateOfBirth());
        student.setEmail(studentDetails.getEmail());
        student.setPhoneNumber(studentDetails.getPhoneNumber());

        return studentRepository.save(student);
    }

    @Override
    public void deleteStudent(Long id) {
        Student student = getStudentById(id);
        studentRepository.delete(student);
    }

    @Override
    public List<Student> searchStudents(String keyword) {
        return studentRepository.findByFirstNameContainingOrLastNameContaining(keyword, keyword);
    }
}