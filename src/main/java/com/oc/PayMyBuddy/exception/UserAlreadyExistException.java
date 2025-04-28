package com.oc.PayMyBuddy.exception;

public class UserAlreadyExistException extends Exception {

    public UserAlreadyExistException(final String message) {
        super(message);
    }
}