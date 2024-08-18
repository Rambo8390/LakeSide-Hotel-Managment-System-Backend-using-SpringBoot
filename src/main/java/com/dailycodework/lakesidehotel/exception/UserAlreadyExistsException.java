package com.dailycodework.lakesidehotel.exception;

/**
 * @author Sagnik Purkait
 */

public class UserAlreadyExistsException extends RuntimeException{
    public UserAlreadyExistsException(String message) {
        super(message);
    }
}
