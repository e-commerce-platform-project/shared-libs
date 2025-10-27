package ru.ivanov.ecommerceplatformproject.sharedlibs.event;

import java.time.LocalDateTime;
import java.util.UUID;

public record KeycloakUserCreatedEvent(
        UUID eventId,
        LocalDateTime timestamp,
        String keycloakUserId,
        String email,
        String firstName,
        String lastName,
        String phone
) {
}