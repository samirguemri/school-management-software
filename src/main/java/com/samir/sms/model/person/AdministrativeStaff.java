package com.samir.sms.model.person;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.samir.sms.model.object.Address;
import com.samir.sms.model.object.Status;

public abstract class AdministrativeStaff extends Person {

    @JsonProperty("profession") private String profession;
    @JsonProperty("status") private Status status;

    public AdministrativeStaff(String name, String surname, Address address, String birthday, String phoneNumber, String email, String profession, Status status) {
        super(name, surname, address, birthday, phoneNumber, email);
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
