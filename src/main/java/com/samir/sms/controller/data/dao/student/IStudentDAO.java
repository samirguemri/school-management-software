package com.samir.sms.controller.data.dao.student;

import com.samir.sms.model.person.Student;
import com.samir.sms.model.object.LocalUniqueId;

import java.util.List;

public interface IStudentDAO {
    void insertNewStudent(Student newStudent);
    List<Student> selectAllStudents();
    Student selectStudentById(LocalUniqueId studentId);
    Student selectStudentByName(String firstName, String lastName);
    Student updateStudentById(LocalUniqueId studentId, Student student);
    boolean deleteStudentById(LocalUniqueId studentId);
    boolean deleteStudentByName(String firstName, String lastName);
    Student searchStudentByLogin(String login);
}
