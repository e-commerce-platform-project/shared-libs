package ru.ivanov.ecommerceplatformproject.sharedlibs.exception;

public class ResourceNotFoundException extends RuntimeException {
    public ResourceNotFoundException(String message) {
        super(message);
    }
}