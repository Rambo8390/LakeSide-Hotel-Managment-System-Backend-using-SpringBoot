package com.dailycodework.lakesidehotel.exception;

/**
 * @author Sagnik Purkait
 */

public class InternalServerException extends RuntimeException {
    public InternalServerException(String message) {
        super(message);
    }
}
