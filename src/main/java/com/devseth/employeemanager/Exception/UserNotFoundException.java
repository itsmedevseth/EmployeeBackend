package com.devseth.employeemanager.Exception;

import org.aspectj.bridge.IMessage;

public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException(String message) {
        super(message);
    }
}
