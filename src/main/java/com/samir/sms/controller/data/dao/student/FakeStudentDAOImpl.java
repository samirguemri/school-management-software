package com.samir.sms.controller.data.dao.student;

import com.samir.sms.controller.data.dao.IDatabaseConnection;
import com.samir.sms.model.object.LocalUniqueId;
import com.samir.sms.model.person.Student;
import org.springframework.stereotype.Repository;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

@Repository("FakeStudentDAO")
public class FakeStudentDAOImpl implements IStudentDAO, IDatabaseConnection {

    private Map<LocalUniqueId,Student> studentTable = null;

    public FakeStudentDAOImpl() throws SQLException {
        this.connect();
    }

    @Override
    public void insertNewStudent(Student student) {
        studentTable.put(student.getUid(),student);
    }

    @Override
    public Student selectStudentById(LocalUniqueId studentId) {
        return studentTable.get(studentId);
    }

    @Override
    public Student selectStudentByName(String firstName, String lastName) {
        Iterator<Student> studentIterator = studentTable.values().iterator();
        while (studentIterator.hasNext()){
            Student student = studentIterator.next();
            if (student.getFirstName() == firstName && student.getLastName() == lastName)
                return student;
        }
        return null;
    }

    @Override
    public List<Student> selectAllStudents() {
        return List.copyOf(studentTable.values());
    }

    @Override
    public Student updateStudentById(LocalUniqueId studentId, Student student) {
        return studentTable.put(studentId,student);
    }

    @Override
    public boolean deleteStudentById(LocalUniqueId studentId) {
        if( studentTable.remove(studentId) != null )
            return true;
        return false;
    }

    @Override
    public boolean deleteStudentByName(String firstName, String lastName) {
        Iterator<Student> studentIterator = studentTable.values().iterator();
        while (studentIterator.hasNext()){
            Student student = studentIterator.next();
            if (student.getFirstName() == firstName && student.getLastName() == lastName)
                return deleteStudentById(student.getUid());
        }
        return false;
    }

    @Override
    public Student searchStudentByLogin(String login) {
        Iterator<Student> studentIterator = studentTable.values().iterator();
        while (studentIterator.hasNext()){
            Student student = studentIterator.next();
            if (student.getLogin() == login)
                return student;
        }
        return null;
    }

    @Override
    public void connect() throws SQLException {
        this.studentTable = new HashMap<>();
        studentTable.put(LocalUniqueId.randomUniqueId(),
                new Student("Samir","Guemri",null,
                            "22-09-1986","0670234209",
                            "samir.guemri@gmail.com",true,null));
    }

    @Override
    public void closeConnection() throws SQLException {
        this.studentTable = null;
    }
}
