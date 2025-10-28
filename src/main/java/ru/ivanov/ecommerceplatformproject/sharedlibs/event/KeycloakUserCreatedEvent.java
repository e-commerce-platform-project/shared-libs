package ru.ivanov.ecommerceplatformproject.sharedlibs.event;

import java.time.LocalDateTime;
import java.util.UUID;

public record KeycloakUserCreatedEvent(
        String keycloakUserId,
        String firstName,
        String lastName,
        String email,
        String phone
) {
}