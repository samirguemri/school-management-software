package com.samir.sms.model.person;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.samir.sms.model.object.Address;

import java.util.ArrayList;
import java.util.List;

public class Parent extends Person {

    @JsonProperty("children") private List<Student> children;

    public Parent(String name, String surname, Address address, String birthday, String phoneNumber, String email) {
        super(name, surname, address, birthday, phoneNumber, email);
        this.children = new ArrayList<>();
    }

    public Parent(String name, String surname, Address address, String birthday, String phoneNumber, String email, List<Student> children) {
        super(name, surname, address, birthday, phoneNumber, email);
        this.children = children;
    }
}
