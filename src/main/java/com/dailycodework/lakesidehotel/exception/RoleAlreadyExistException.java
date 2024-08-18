package com.dailycodework.lakesidehotel.exception;

/**
 * @author Sagnik Purkait
 */

public class RoleAlreadyExistException extends RuntimeException {
    public RoleAlreadyExistException(String message) {
        super(message);
    }
}
