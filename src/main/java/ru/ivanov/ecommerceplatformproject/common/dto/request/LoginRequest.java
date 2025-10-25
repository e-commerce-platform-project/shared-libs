package ru.ivanov.ecommerceplatformproject.common.dto.request;

public record LoginRequest(
        String email,
        String password
) {
}
