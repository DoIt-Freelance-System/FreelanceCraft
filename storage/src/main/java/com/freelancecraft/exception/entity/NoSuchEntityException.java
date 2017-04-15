package com.freelancecraft.exception.entity;

/**
 * Exception for user service.
 */
public class NoSuchEntityException extends RuntimeException {

    /**
     * Constructs a new exception with {@code null} as its detail message.
     */
    public NoSuchEntityException() {
        super();
    }

    /**
     * Constructs a new exception with the specified detail message.
     *
     * @param message the detail message.
     */
    public NoSuchEntityException(String message) {
        super(message);
    }
}