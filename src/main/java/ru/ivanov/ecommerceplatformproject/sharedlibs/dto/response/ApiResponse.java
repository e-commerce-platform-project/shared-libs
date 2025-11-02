package ru.ivanov.ecommerceplatformproject.sharedlibs.dto.response;

import java.time.LocalDateTime;

public record ApiResponse(
        String message,
        boolean success,
        LocalDateTime timestamp

) {
    public static ApiResponse success(String message) {
        return new ApiResponse(message, true, java.time.LocalDateTime.now());
    }

    public static ApiResponse error(String message) {
        return new ApiResponse(message, false, java.time.LocalDateTime.now());
    }
}