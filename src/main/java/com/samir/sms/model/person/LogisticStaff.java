package com.samir.sms.model.person;

import com.samir.sms.model.object.Address;

public abstract class LogisticStaff extends Person {

    public LogisticStaff(String firstName, String lastName, Address address, String birthday, String phoneNumber, String email) {
        super(firstName, lastName, address, birthday, phoneNumber, email);
    }
}
