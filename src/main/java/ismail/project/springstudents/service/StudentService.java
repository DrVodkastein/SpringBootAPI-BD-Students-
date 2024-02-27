package ismail.project.springstudents.service;

import ismail.project.springstudents.model.Student;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

    public interface StudentService {
        List<Student> findALLStudent();
        Student saveStudent(Student student);
        Student findByEmail(String email);
        Student updateStudent(Student student);
        void deleteStudent(String email);

}

