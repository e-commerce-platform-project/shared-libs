package ru.ivanov.ecommerceplatformproject.sharedlibs.dto.request;

public record VerifyEmailCodeRequest(
        String code,
        String email
) {
}