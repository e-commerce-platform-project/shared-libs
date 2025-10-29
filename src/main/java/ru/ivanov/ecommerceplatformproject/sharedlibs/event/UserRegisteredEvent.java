package ru.ivanov.ecommerceplatformproject.sharedlibs.event;

import lombok.Builder;

@Builder
public record UserRegisteredEvent(
        String userId,
        String firstName,
        String lastName,
        String email,
        String verificationCode
) {
}