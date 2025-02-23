package com.samir.sms.model.object;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Address {

    @JsonProperty("number") private int number;
    @JsonProperty("street") private String street;
    @JsonProperty("city") private String city;
    @JsonProperty("zip") private Integer zip;

    public Address(int number, String street, String city, Integer zip) {
        this.number = number;
        this.street = street;
        this.city = city;
        this.zip = zip;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Integer getZip() {
        return zip;
    }

    public void setZip(Integer zip) {
        this.zip = zip;
    }
}
