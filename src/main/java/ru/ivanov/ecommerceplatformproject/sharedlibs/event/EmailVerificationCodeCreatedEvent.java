package ru.ivanov.ecommerceplatformproject.sharedlibs.event;

public record EmailVerificationCodeCreatedEvent(
        String firstName,
        String lastName,
        String email,
        String code
) {
}