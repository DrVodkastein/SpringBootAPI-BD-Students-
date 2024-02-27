package ismail.project.springstudents.service.Impl;

import ismail.project.springstudents.model.Student;
import ismail.project.springstudents.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InMemoryStudentServiceImpl implements StudentService {

    @Override
    public List<Student> findALLStudent() {
        return null;
    }
    @Override
    public Student saveStudent(Student student) {
        return null;
    }

    @Override
    public Student findByEmail(String email) {
        return null;
    }

    @Override
    public Student updateStudent(Student student) {
        return null;
    }

    @Override
    public void deleteStudent(String email) {

    }
}
