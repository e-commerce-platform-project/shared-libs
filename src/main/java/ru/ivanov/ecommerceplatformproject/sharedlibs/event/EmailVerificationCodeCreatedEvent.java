package ru.ivanov.ecommerceplatformproject.sharedlibs.event;

import java.time.LocalDateTime;
import java.util.UUID;

public record EmailVerificationCodeCreatedEvent(
        UUID eventId,
        LocalDateTime timestamp,
        String email,
        String code,
        String keycloakUserId,
        VerificationType verificationType,
        LocalDateTime expiresAt

) {
    public enum VerificationType {
        EMAIL_VERIFICATION,
        // ОСТАЛЬНЫЕ
    }
}