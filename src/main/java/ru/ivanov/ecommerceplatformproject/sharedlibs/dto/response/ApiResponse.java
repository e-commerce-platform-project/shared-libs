package ru.ivanov.ecommerceplatformproject.sharedlibs.dto.response;

import java.time.LocalDateTime;


public class ApiResponse {
    private final String message;
    private final boolean success;
    private final LocalDateTime timestamp;

    public ApiResponse(String message, boolean success, LocalDateTime timestamp) {
        this.message = message;
        this.success = success;
        this.timestamp = timestamp;
    }

    public static ApiResponse success(String message) {
        return new ApiResponse(message, true, LocalDateTime.now());
    }

    public static ApiResponse error(String message) {
        return new ApiResponse(message, false, LocalDateTime.now());
    }
}