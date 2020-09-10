package com.samir.sms.api.model.subject;

import com.samir.sms.api.model.person.Student;

import java.util.List;

public class Grade {

    public GradeItem grade;
    private int classNumber;
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
}
