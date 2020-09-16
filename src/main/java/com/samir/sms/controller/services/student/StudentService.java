package com.samir.sms.controller.services.student;

import com.samir.sms.controller.data.dao.scores.IScoresDAO;
import com.samir.sms.controller.data.dao.student.IStudentDAO;
import com.samir.sms.model.object.*;
import com.samir.sms.model.person.Student;
import com.samir.sms.model.person.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("StudentService")
public class StudentService {

    private final IStudentDAO studentDAO;
    private final IScoresDAO scoresDAO;

    @Autowired
    public StudentService(@Qualifier("FakeStudentDAO") IStudentDAO studentDAO,@Qualifier("FakeScoresDAO") IScoresDAO scoresDAO) {
        this.studentDAO = studentDAO;
        this.scoresDAO = scoresDAO;
    }

    public void addNewStudent(Student student) {

        studentDAO.insertNewStudent(student);
    }

    public Student getStudentById(LocalUniqueId studentId) {

        return studentDAO.selectStudentById(studentId);
    }

    public Student getStudentByName(String firstName, String lastName) {

        return studentDAO.selectStudentByName(firstName,lastName);
    }

    public List<Student> getAllStudents(){

        return studentDAO.selectAllStudents();
    }

    public Student updateStudentById(LocalUniqueId studentId, Student student) {

        return studentDAO.updateStudentById(studentId,student);
    }

    public boolean deleteStudentById(LocalUniqueId studentId) {

        return studentDAO.deleteStudentById(studentId);
    }

    public boolean deleteStudentByName(String firstName, String lastName) {

        return studentDAO.deleteStudentByName(firstName,lastName);
    }

    private Student searchStudentByLogin(String login){

        return studentDAO.searchStudentByLogin(login);
    }

    public boolean connect(String login, String password) {

        Student student = searchStudentByLogin(login);
        if ( student != null)
            if(student.getPassword() == password)
                return true;
        return false;
    }

    public boolean disconnect(Student student) {
        return true;
    }

    public Planning displayPlanning(Student student) {
        return student.getPlanning();
    }

    public Float displayCourseScore(Student student, Course course) {
        return 1.F;
    }

    public void displayStudiesScores(Student student) {

    }

    public void sendMessageTeacher(Student student, Teacher teacher) {

    }

    public void readMessage(){}

    public void participateDiscussion(Student student, DiscussionThread thread) {

    }

    public void DisplayExercises(Student student){}

    public void solveExercise(Student student, Exercise exercise) {

    }

    public void setStudentScores(Student student, Scores scores) {
        scoresDAO.insertStudentScores(student,scores);
    }

    public void addStudentCourseScore(Student student,CourseItem courseItem, Float score){
        Scores scores = scoresDAO.selectStudentScores(student);
        scores.getScores().put(courseItem,score);
        scoresDAO.insertStudentScores(student,scores);
    }

    public Scores getStudentScores(Student student) {
        return scoresDAO.selectStudentScores(student);
    }

    public Float getStudentScore(Student student, CourseItem courseItem) {
        return scoresDAO.selectStudentCourseScore(student,courseItem);
    }

    public boolean updateStudentScores(Student student, CourseItem courseItem, Float newScore) {
        return scoresDAO.updateStudentScores(student,courseItem,newScore);
    }
}
