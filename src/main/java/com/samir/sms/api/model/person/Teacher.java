package com.samir.sms.api.model.person;

import java.util.List;
import com.samir.sms.api.model.subject.*;

public class Teacher extends Adult {

    private CourseItem discipline;
    private Planning planning;
    private String classroom;
    private List<Grade> classes;
    private CarrierLevel level;
    // private int tenureDate;
    // private int capesDate;

    public Teacher(String name, String surname, Address address, String phoneNumber, String email,
                   CourseItem discipline, Planning planning, String classroom, CarrierLevel level) {
        super(name, surname, address, phoneNumber, email);
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
