package com.samir.sms.api.model.subject;

public class Course {

    private CourseItem courseTitle;
    private GradeItem grade;
    private String courseCode;
    private int numberHoursWeekly;
    private int coefficient;

    public Course(GradeItem grade, CourseItem courseTitle, String courseCode, int numberHoursWeekly, int coefficient) {
        this.grade = grade;
        this.courseTitle = courseTitle;
        this.courseCode = courseCode;
        this.numberHoursWeekly = numberHoursWeekly;
        this.coefficient = coefficient;
    }

    public CourseItem getCourseTitle() {
        return courseTitle;
    }

    public void setCourseTitle(CourseItem courseTitle) {
        this.courseTitle = courseTitle;
    }

    public GradeItem getGrade() {
        return grade;
    }

    public void setGrade(GradeItem grade) {
        this.grade = grade;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public int getNumberHoursWeekly() {
        return numberHoursWeekly;
    }

    public void setNumberHoursWeekly(int numberHoursWeekly) {
        this.numberHoursWeekly = numberHoursWeekly;
    }

    public int getCoefficient() {
        return coefficient;
    }

    public void setCoefficient(int coefficient) {
        this.coefficient = coefficient;
    }
}
