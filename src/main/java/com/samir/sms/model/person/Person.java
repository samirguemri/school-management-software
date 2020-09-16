package com.samir.sms.model.person;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.samir.sms.model.object.Address;
import com.samir.sms.model.object.LocalUniqueId;

abstract class Person {

    @JsonProperty("uid") private LocalUniqueId uid;
    @JsonProperty("firstName") private String firstName;
    @JsonProperty("lastName") private String lastName;
    @JsonProperty("address") private Address address;
    @JsonProperty("phoneNumber") private String phoneNumber;
    @JsonProperty("email") private String email;
    @JsonProperty("birthday") private String birthday;
    @JsonProperty("login") private String login;
    @JsonProperty("password") private String password;

    public Person(String firstName, String lastName, Address address, String birthday, String phoneNumber, String email) {
        this.uid = LocalUniqueId.randomUniqueId();
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.birthday = birthday;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.login = firstName+"."+lastName;
        this.password = LocalUniqueId.randomString();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
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

    public String getLogin() { return login; }

    public String getPassword() { return password; }

    public LocalUniqueId getUid() {
        return uid;
    }
}
