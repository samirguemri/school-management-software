package com.samir.sms.api.model.person;

import com.samir.sms.api.model.subject.Address;

public class LogisticStaff extends Adult {

    public LogisticStaff(String name, String surname, Address address, String phoneNumber, String email) {
        super(name, surname, address, phoneNumber, email);
    }
}
