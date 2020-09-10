package com.samir.sms.api.model.person;

import com.samir.sms.api.model.subject.Address;
import com.samir.sms.api.model.subject.Status;

public class AdministrativeStaff extends Adult {

    private String profession;
    private Status status;

    public AdministrativeStaff(String name, String surname, Address address, String phoneNumber, String email, String profession, Status status) {
        super(name, surname, address, phoneNumber, email);
        this.profession = profession;
        this.status = status;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
