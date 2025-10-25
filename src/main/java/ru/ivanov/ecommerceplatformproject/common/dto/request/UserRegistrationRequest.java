package ru.ivanov.ecommerceplatformproject.common.dto.request;

public record UserRegistrationRequest(
        String email,
        String firstName,
        String lastName,
        String password
) {
}