package com.samir.sms.exceptions;

public class NotFoundStudentException extends Exception {
    public NotFoundStudentException() {
        super("Object within this ID is NOT exist !!");
    }
}
