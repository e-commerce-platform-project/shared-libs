package ru.ivanov.ecommerceplatformproject.sharedlibs.event;

import lombok.Builder;

@Builder
public record VerificationCodeIssuedEvent(
        String email,
        String code
) {
}