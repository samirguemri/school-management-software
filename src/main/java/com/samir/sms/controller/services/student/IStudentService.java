package com.samir.sms.controller.services.student;

import com.samir.sms.model.object.*;

import com.samir.sms.model.person.Student;
import com.samir.sms.model.person.Teacher;

public interface IStudentService {
    void addNewStudent(Student student);
    Student getStudentById(LocalUniqueId studentId);
    Student getStudentByName(String firstName, String lastName);
    Student updateStudentById(LocalUniqueId studentId);
    Student updateStudentByName(String firstName, String lastName);
    boolean deleteStudentById(LocalUniqueId studentId);
    boolean deleteStudentByName(String firstName, String lastName);
    boolean connect(String login, String password);
    boolean disconnect(Student student);
    Planning displayPlanning(Student student);
    void displayCourseScore(Student student, Course course);
    void displayStudiesScores(Student student);
    void sendMessageTeacher(Student student, Teacher teacher);
    void participateDiscussion(Student student, DiscussionThread thread);
    void solveExercise(Student student, Exercise exercise);
}
