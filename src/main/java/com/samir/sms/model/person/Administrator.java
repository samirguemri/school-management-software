package com.samir.sms.model.person;

import com.samir.sms.model.object.Address;
import com.samir.sms.model.object.Status;

public class Administrator extends AdministrativeStaff {

    public Administrator(String name, String surname, Address address, String birthday, String phoneNumber, String email, String profession, Status status) {
        super(name, surname, address, birthday, phoneNumber, email, profession, status);
    }
}
