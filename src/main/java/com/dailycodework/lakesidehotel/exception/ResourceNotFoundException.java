package com.dailycodework.lakesidehotel.exception;

/**
 * @author Sagnik Purkait
 */

public class ResourceNotFoundException extends RuntimeException {
    public ResourceNotFoundException(String message) {
        super(message);
    }
}
