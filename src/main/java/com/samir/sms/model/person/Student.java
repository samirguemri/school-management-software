package com.samir.sms.model.person;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.samir.sms.model.object.Address;
import com.samir.sms.model.object.Grade;
import com.samir.sms.model.object.Planning;

public class Student extends Person {

    @JsonProperty("canteen") private boolean canteen;
    @JsonProperty("parent") private Parent parent;
    @JsonProperty("grade") private Grade grade;
    @JsonProperty("planning") private Planning planning;

    public Student(String firstName, String lastName, Address address, String birthday, String phoneNumber,
                         String email, boolean canteen, Parent parent ) {
        super(firstName, lastName, address, birthday, phoneNumber, email);
        this.canteen = canteen;
        this.parent = parent;

        assignIntoGrade();

    }

    private void assignIntoGrade() {
        //this.grade = listOfGrades.getGrade("gradeCode");
        //this.planning = grade.getPlanning();
    }

    public boolean isCanteen() {
        return canteen;
    }

    public Parent getParent() {
        return parent;
    }

    public Grade getGrade() {
        return grade;
    }

    public Planning getPlanning() {
        return planning;
    }
}
