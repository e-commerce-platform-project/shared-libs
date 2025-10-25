package ru.ivanov.ecommerceplatformproject.common.event;

import java.util.UUID;

public record UserDeletedEvent(
        UUID userId
) {
}