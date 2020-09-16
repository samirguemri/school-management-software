package com.samir.sms.exceptions;

public class ExistingException extends Exception {
    public ExistingException() {
        super("Can't insert .. This Object already exist !!");
    }
    public ExistingException(String message) {super(message);}
}
