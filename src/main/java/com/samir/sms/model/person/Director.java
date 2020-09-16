package com.samir.sms.model.person;

import com.samir.sms.model.object.Address;
import com.samir.sms.model.object.Status;

public class Director extends AdministrativeStaff {

    public Director(String name, String surname, Address address, String birthday, String phoneNumber, String email, String profession, Status status) {
        super(name, surname, address, birthday, phoneNumber, email, profession, status);
    }
}
