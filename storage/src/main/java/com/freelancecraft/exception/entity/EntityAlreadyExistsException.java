package com.freelancecraft.exception.entity;

/**
 * Exception for user service.
 */
public class EntityAlreadyExistsException extends RuntimeException {

    /**
     * Constructs a new exception with {@code null} as its detail message.
     */
    public EntityAlreadyExistsException() {
        super();
    }

    /**
     * Constructs a new exception with the specified detail message.
     *
     * @param message the detail message.
     */
    public EntityAlreadyExistsException(String message) {
        super(message);
    }
}