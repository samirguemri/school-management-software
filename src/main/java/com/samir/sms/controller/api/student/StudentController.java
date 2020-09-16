package com.samir.sms.controller.api.student;


import com.samir.sms.controller.services.student.StudentService;
import com.samir.sms.model.person.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("sms/student")
public class StudentController {

    private final StudentService studentService;

    @Autowired
    public StudentController(@Qualifier("StudentService") StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping(   name = "addStudent",
                    path = "/add",
                    consumes = MediaType.APPLICATION_JSON_VALUE
    )
    public void addNewStudent(@RequestBody Student student) {

        studentService.addNewStudent(student);
    }

    @GetMapping(
            name = "Students",
            path = "/allStudents",
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public List<Student> getAllStudents(){
        return studentService.getAllStudents();
    }
}
