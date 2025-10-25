package ru.ivanov.ecommerceplatformproject.common.dto.request;

public record LogoutRequest(
        String refreshToken
) {
}