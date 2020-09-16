package com.samir.sms.model.object;

import com.samir.sms.model.person.Student;

import java.util.List;

public class Grade {

    private GradeItem grade;
    private int classNumber;

    private List<Course> studies;
    private Planning planning;
    private List<Student> studentList;

    public Grade(GradeItem grade, int classNumber) {
        this.grade = grade;
        this.classNumber = classNumber;
    }

    @Override
    public String toString() {
        return grade + "-" + classNumber;
    }

    public Planning getPlanning() {
        return planning;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setPlanning(Planning planning) {
        this.planning = planning;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    public List<Course> getStudies() {
        return studies;
    }
}
