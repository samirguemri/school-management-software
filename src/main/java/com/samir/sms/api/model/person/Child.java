package com.samir.sms.api.model.person;

import com.samir.sms.api.model.subject.Address;

class Child {

    private String name;
    private String surname;
    private Address address;
    private String birthday;
    private String birthplace;
    private String phoneNumber;
    private String email;
    private boolean canteen;

    public Child(String name, String surname, Address address, String birthday, String birthplace, String phoneNumber, String email, boolean canteen) {
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.birthday = birthday;
        this.birthplace = birthplace;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.canteen = canteen;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
