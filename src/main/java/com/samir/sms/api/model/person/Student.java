package com.samir.sms.api.model.person;

import com.samir.sms.api.model.subject.Address;
import com.samir.sms.api.model.subject.Grade;
import com.samir.sms.api.model.subject.Planning;

public class Student extends Child {

    private Parent parent;
    private Grade grade;
    private Planning planning;

    public Student(String name, String surname, Address address, String birthday, String birthplace,
                        String phoneNumber, String email, boolean canteen, Parent parent) {
        super(name, surname, address, birthday, birthplace, phoneNumber, email, canteen);
        this.parent = parent;

        assignIntoGrade();

    }

    private void assignIntoGrade() {
        //this.grade = listOfGrades.getGrade("gradeCode");
        //this.planning = grade.getPlanning();
    }
}
