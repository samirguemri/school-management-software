package com.samir.sms.model.person;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.samir.sms.model.object.*;

public class Teacher extends Person {

    @JsonProperty("discipline") private CourseItem discipline;
    @JsonProperty("planning") private Planning planning;
    @JsonProperty("classroom") private String classroom;
    @JsonProperty("classes") private List<Grade> classes;
    @JsonProperty("level") private CarrierLevel level;
    // private int tenureDate;
    // private int capesDate;

    public Teacher(String firstName, String lastName, Address address, String birthday, String phoneNumber, String email,
                   CourseItem discipline, Planning planning, String classroom, CarrierLevel level) {
        super(firstName, lastName, address, birthday, phoneNumber, email);
        this.discipline = discipline;
        this.planning = planning;
        this.classroom = classroom;
        this.level = level;
    }

    public CourseItem getDiscipline() {
        return discipline;
    }

    public void setDiscipline(CourseItem discipline) {
        this.discipline = discipline;
    }

    public Planning getPlanning() {
        return planning;
    }

    public void setPlanning(Planning planning) {
        this.planning = planning;
    }

    public String getClassroom() {
        return classroom;
    }

    public void setClassroom(String classroom) {
        this.classroom = classroom;
    }

    public List<Grade> getClasses() {
        return classes;
    }

    public void setClasses(List<Grade> classes) {
        this.classes = classes;
    }

    public CarrierLevel getLevel() {
        return level;
    }

    public void setLevel(CarrierLevel level) {
        this.level = level;
    }
}
