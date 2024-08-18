package com.dailycodework.lakesidehotel.exception;

/**
 * @author Sagnik Purkait
 */

public class InvalidBookingRequestException extends RuntimeException {
    public InvalidBookingRequestException(String message) {
        super(message);
    }
}
