package com.samir.sms.api.model.person;

import com.samir.sms.api.model.subject.Address;

import java.util.ArrayList;
import java.util.List;

public class Parent extends Adult {

    private List<Child> children;

    public Parent(String name, String surname, Address address, String phoneNumber, String email) {
        super(name, surname, address, phoneNumber, email);
        this.children = new ArrayList<>();
        addChildren("");
    }

    public Parent(String name, String surname, Address address, String phoneNumber, String email, List<Child> children) {
        super(name, surname, address, phoneNumber, email);
        this.children = children;
    }

    private void addChildren(String childName) {
        //Child child = getStudents().getStudent(selectStudentByName(childName));
        //this.children.add(child);
    }
}
