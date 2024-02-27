package ismail.project.springstudents.controller;


import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ismail.project.springstudents.model.Student;
import ismail.project.springstudents.service.StudentService;

import java.util.List;
@RestController //aqui se usa restcontroller en vez de solo controller para no tener que escribir encima de cada metodo responsbody
@RequestMapping("/api/v1/students")
@AllArgsConstructor
public class StudentController {

    private final StudentService service;
    @GetMapping
    public List<Student> findALLStudent() {
        //todo

        return service.findALLStudent();
    }
}
